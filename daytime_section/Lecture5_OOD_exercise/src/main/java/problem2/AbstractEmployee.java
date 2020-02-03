package problem2;

import java.util.Objects;

public abstract class AbstractEmployee implements Employee{

  protected Integer hourlyRate;
  protected Integer hoursWorked;

  public AbstractEmployee(Integer hourlyRate, Integer hoursWorked) {
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  public Integer getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(Integer hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public Integer getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(Integer hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof AbstractEmployee)) return false;
    AbstractEmployee that = (AbstractEmployee) o;
    return Objects.equals(getHourlyRate(), that.getHourlyRate()) &&
        Objects.equals(getHoursWorked(), that.getHoursWorked());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getHourlyRate(), getHoursWorked());
  }

  @Override
  public String toString() {
    return "AbstractEmployee{" +
        "hourlyRate=" + hourlyRate +
        ", hoursWorked=" + hoursWorked +
        '}';
  }
}
