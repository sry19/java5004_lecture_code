package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Manages the interaction between client and server.
 */
public class Protocol {
  private ServerStatus status;
  private static final String URL = "https://ron-swanson-quotes.herokuapp.com/v2/quotes/";

  /**
   * Pattern to check that input contains only digits
   */
  private static final Pattern IS_DIGIT = Pattern.compile("^\\d+$");
  private static final Pattern QUIT = Pattern.compile("bye", Pattern.CASE_INSENSITIVE);

  public Protocol() {
    this.status = ServerStatus.STARTING;
  }

  public String processInput(String input) {
    String output = "";
    this.setStatusBasedOnInput(input);
    switch (this.status) {
      case WAITING:
        output = "No quotes for you.";
        break;
      case GET_QUOTES:
        output = getQuotes(Integer.parseInt(input));
        break;
      case QUITTING:
        output = "BYE";
        break;
      case STARTING:
        output = "I'm listening.";
        break;
      default:
        output = "...";
    }
    return output;
  }

  private void setStatusBasedOnInput(String input) {
    if (input != null) {
      if (IS_DIGIT.matcher(input).matches()) {
        this.status = ServerStatus.GET_QUOTES;
      } else if (QUIT.matcher(input).matches()) {
        this.status = ServerStatus.QUITTING;
      } else this.status = ServerStatus.WAITING;
    }
  }

  /**
   * Separates and formats the Ron Swanson quotes
   * Returns a stream of quotes we can pass to flatMap to create a list
   */
  private static Function<String, Stream<String>> tidyUp = s -> {
    s = s.replaceAll("(\\[|\\])", "");
    Pattern splitAtCommas = Pattern.compile("\",\"");

    return splitAtCommas.splitAsStream(s);
  };


  private static String getQuotes(int num) {
    String quotes = "";
    try {
      // Create URL
      URL myURL = new URL(URL + num);
      BufferedReader in = new BufferedReader(
          new InputStreamReader(myURL.openStream()));

      quotes = in.lines().flatMap(tidyUp::apply).collect(Collectors.joining("\"\t\""));
      // Don't forget to close!
      in.close();
    }
    catch (MalformedURLException e) {
      // Bad URL()
      // ...
      e.printStackTrace();
    }
    catch (IOException e) {
      // openStream() failed
      // ...
      e.printStackTrace();
    }
    return quotes;
  }
}
