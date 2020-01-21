package problem1;

import java.util.Objects;

public class BaseballPlayer extends Athlete {
  private String team;
  private Double averageBatting;
  private Integer homeRuns;

  public BaseballPlayer(Name athletesName, Double height, Double weight, String league, String team, Double battingAvg, Integer homeRuns){
    super(athletesName, height, weight, league);
    this.team = team;
    this.averageBatting = battingAvg;
    this.homeRuns = homeRuns;
  }

  public String getTeam() {
    return team;
  }

  public Double getAverageBatting() {
    return averageBatting;
  }

  public Integer getHomeRuns() {
    return homeRuns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof BaseballPlayer)) return false;
    if (!super.equals(o)) return false;
    BaseballPlayer that = (BaseballPlayer) o;
    return Objects.equals(getTeam(), that.getTeam()) &&
        Objects.equals(getAverageBatting(), that.getAverageBatting()) &&
        Objects.equals(getHomeRuns(), that.getHomeRuns());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getTeam(), getAverageBatting(), getHomeRuns());
  }

  @Override
  public String toString() {
    return "BaseballPlayer{" +
        "team='" + team + '\'' +
        ", averageBatting=" + averageBatting +
        ", homeRuns=" + homeRuns +
        '}';
  }
}
