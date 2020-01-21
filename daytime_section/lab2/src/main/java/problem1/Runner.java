package problem1;

import java.util.Objects;

public class Runner extends Athlete {
  private Double best5KTime;
  private Double bestHalfMarathonTime;
  private String favoriteEvent;

  public Runner(Name athletesName, Double height, Double weight, String league, Double best5KTime, Double bestHalfMarathonTime, String favoriteEvent) {
    super(athletesName, height, weight, league);
    this.best5KTime = best5KTime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favoriteEvent = favoriteEvent;
  }

  public Double getBest5KTime() {
    return best5KTime;
  }

  public Double getBestHalfMarathonTime() {
    return bestHalfMarathonTime;
  }

  public String getFavoriteEvent() {
    return favoriteEvent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Runner)) return false;
    if (!super.equals(o)) return false;
    Runner runner = (Runner) o;
    return Objects.equals(getBest5KTime(), runner.getBest5KTime()) &&
        Objects.equals(getBestHalfMarathonTime(), runner.getBestHalfMarathonTime()) &&
        Objects.equals(getFavoriteEvent(), runner.getFavoriteEvent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getBest5KTime(), getBestHalfMarathonTime(), getFavoriteEvent());
  }

  @Override
  public String toString() {
    return "Runner{" +
        "best5KTime=" + best5KTime +
        ", bestHalfMarathonTime=" + bestHalfMarathonTime +
        ", favoriteEvent='" + favoriteEvent + '\'' +
        '}';
  }
}
