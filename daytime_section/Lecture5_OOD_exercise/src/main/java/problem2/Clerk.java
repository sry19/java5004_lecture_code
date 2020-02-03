package problem2;

public class Clerk extends Worker {

  public Clerk(Integer hourlyRate, Integer hoursWorked) {
    super(hourlyRate, hoursWorked);
  }

  @Override
  public Integer amountDue() {
    return null;
  }
}
