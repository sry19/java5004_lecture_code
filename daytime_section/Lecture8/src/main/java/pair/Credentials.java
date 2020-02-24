package pair;

public class Credentials {
  private GenericPair<String, Integer> credentials;

  public Credentials(String username, Integer passwordHash){
    this.credentials = new GenericPair<> (username, passwordHash);
  }

  @Override
  public String toString() {
    return "Credentials{" +
        "username = " + credentials.getFirst() + ", " +
        "password = " + "*****" +
        '}';
  }
}
