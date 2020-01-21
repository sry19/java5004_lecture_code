package assignment1;

/*
 * Class BaseballPlayer contains public information about a baseball player. This c
 * class inherits from class Athlete.
 */
public class BaseballPlayer extends Athlete {

  private String team;
  private Double averageBatting;
  private Integer seasonHomeRuns;

  /*
   * Constructs an object BaseballPlayer, based upon the seven provided inpit arguments.
   * @param athletesName - athlete's name as a String
   * @param height -  athlete's height as a Double
   * @param weight - athlete's height as a Double
   * @param league - athlete's league as a String
   * @param team - athlete;'s team, as a String
   * @param averageBatting - athlete's average batting, as a Double
   * @param seasonHomeRuns - athlete;s home runs, as an Integer
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String league, String team, Double averageBatting, Integer seasonHomeRuns) {
    super(athletesName, height, weight, league);
    this.team = team;
    this.averageBatting = averageBatting;
    this.seasonHomeRuns = seasonHomeRuns;
  }


  /*
   * Constructs an object BaseballPlayer, based upon the six provided inpit arguments.
   * @param athletesName - athlete's name as a String
   * @param height -  athlete's height as a Double
   * @param weight - athlete's height as a Double
   * @param team - athlete;'s team, as a String
   * @param averageBatting - athlete's average batting, as a Double
   * @param seasonHomeRuns - athlete;s home runs, as an Integer
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String team, Double averageBatting, Integer seasonHomeRuns) {
    super(athletesName, height, weight);
    this.team = team;
    this.averageBatting = averageBatting;
    this.seasonHomeRuns = seasonHomeRuns;
  }

  /*
   * Retruns the name of the athelete's team, as a String.
   */
  public String getTeam() {
    return team;
  }

  /*
   * Retruns the athelete's average batting score, as a Double.
   */
  public Double getAverageBatting() {
    return averageBatting;
  }

  /*
   * Retruns the athelete's season home runs, as an Integer.
   */
  public Integer getSeasonHomeRuns() {
    return seasonHomeRuns;
  }
}
