package problem2;

public class Manager extends Management {

  public Manager(Integer hourlyRate, Integer hoursWorked, Integer numSupervisedEmployees, Integer costOfSupervisedEmployees) {
    super(hourlyRate, hoursWorked, numSupervisedEmployees, costOfSupervisedEmployees);
  }

  @Override
  public Integer amountDue() {
    return null;
  }
}
