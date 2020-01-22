package assignment1;

/*
 *Class Runner contains public information about a runner.
 */
public class Runner extends Athlete {

  private Double best5Ktime;
  private Double bestHalfMarathonTime;
  private String favoriteRunningEvent;

  /*
   * Constructor for object Runner. This constructor takes seven input arguments,
   * and generates a new Runner object.
   * @param athletesName - athlete's name as a String
   * @param height -  athlete's height as a Double
   * @param weight - athlete's height as a Double
   * @param league - athlete's league as a String
   * @param best5Ktime - best 5k running time as a Double
   * @param bestHalfMarathontime - best half marathon running time as a Double
   * @param favoriteRunningEvent - favorite running event as a String
   */
  public Runner(Name athletesName, Double height, Double weight, String league, Double best5Ktime, Double bestHalfMarathonTime, String favoriteRunningEvent) {
    super(athletesName, height, weight, league);
    this.best5Ktime = best5Ktime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favoriteRunningEvent = favoriteRunningEvent;
  }

  /*
   * Constructor for object Runner. This constructor takes six input arguments,
   * and generates a new Runner object.
   * @param athletesName - athlete's name as a String
   * @param height -  athlete's height as a Double
   * @param weight - athlete's height as a Double
   * @param best5Ktime - best 5k running time as a Double
   * @param bestHalfMarathontime - best half marathon running time as a Double
   * @param favoriteRunningEvent - favorite running event as a String
   */
  public Runner(Name athletesName, Double height, Double weight, Double best5Ktime, Double bestHalfMarathonTime, String favoriteRunningEvent) {
    super(athletesName, height, weight);
    this.best5Ktime = best5Ktime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favoriteRunningEvent = favoriteRunningEvent;
  }

  /*
   * Getter for best 5K time, returned as a Double.
   */
  public Double getBest5Ktime() {
    return best5Ktime;
  }

  /*
   * Getter for best half-marathon time, returned as a Double.
   */
  public Double getBestHalfMarathonTime() {
    return bestHalfMarathonTime;
  }

  /*
   * Getter for the favorite running event, returned as a String.
   */
  public String getFavoriteRunningEvent() {
    return favoriteRunningEvent;
  }
}
