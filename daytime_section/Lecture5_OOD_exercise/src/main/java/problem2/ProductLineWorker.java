package problem2;

public class ProductLineWorker extends Worker{

  public ProductLineWorker(Integer hourlyRate, Integer hoursWorked) {
    super(hourlyRate, hoursWorked);
  }

  @Override
  public Integer amountDue() {
    return null;
  }
}
