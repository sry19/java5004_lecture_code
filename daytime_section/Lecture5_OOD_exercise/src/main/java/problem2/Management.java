package problem2;

import java.util.Objects;

public abstract class Management extends AbstractEmployee {

  protected Integer numSupervisedEmployees;
  protected Integer costOfSupervisedEmployees;

  public Management(Integer hourlyRate, Integer hoursWorked, Integer numSupervisedEmployees, Integer costOfSupervisedEmployees) {
    super(hourlyRate, hoursWorked);
    this.numSupervisedEmployees = numSupervisedEmployees;
    this.costOfSupervisedEmployees = costOfSupervisedEmployees;
  }

  public Integer getNumSupervisedEmployees() {
    return numSupervisedEmployees;
  }

  public void setNumSupervisedEmployees(Integer numSupervisedEmployees) {
    this.numSupervisedEmployees = numSupervisedEmployees;
  }

  public Integer getCostOfSupervisedEmployees() {
    return costOfSupervisedEmployees;
  }

  public void setCostOfSupervisedEmployees(Integer costOfSupervisedEmployees) {
    this.costOfSupervisedEmployees = costOfSupervisedEmployees;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Management)) return false;
    if (!super.equals(o)) return false;
    Management that = (Management) o;
    return Objects.equals(getNumSupervisedEmployees(), that.getNumSupervisedEmployees()) &&
        Objects.equals(getCostOfSupervisedEmployees(), that.getCostOfSupervisedEmployees());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getNumSupervisedEmployees(), getCostOfSupervisedEmployees());
  }

  @Override
  public String toString() {
    return "Management{" +
        "numSupervisedEmployees=" + numSupervisedEmployees +
        ", costOfSupervisedEmployees=" + costOfSupervisedEmployees +
        '}';
  }
}
