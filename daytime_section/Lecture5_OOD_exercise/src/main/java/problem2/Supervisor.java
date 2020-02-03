package problem2;

public class Supervisor extends Management {

  public Supervisor(Integer hourlyRate, Integer hoursWorked, Integer numSupervisedEmployees, Integer costOfSupervisedEmployees) {
    super(hourlyRate, hoursWorked, numSupervisedEmployees, costOfSupervisedEmployees);
  }

  @Override
  public Integer amountDue() {
    return null;
  }
}
