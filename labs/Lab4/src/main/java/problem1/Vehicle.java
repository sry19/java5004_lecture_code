package problem1;

import java.util.Objects;

public abstract class Vehicle {

  private String ID;
  private Float averageSpeed;
  private Float maxSpeed;

  public Vehicle(String ID, Float averageSpeed, Float maxSpeed) {
    this.ID = ID;
    this.averageSpeed = averageSpeed;
    this.maxSpeed = maxSpeed;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public Float getAverageSpeed() {
    return averageSpeed;
  }

  public void setAverageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
  }

  public Float getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(Float maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

   public Integer getDuration(Float distance){
    return Math.round(distance/this.averageSpeed);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Vehicle)) return false;
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(getID(), vehicle.getID()) &&
        Objects.equals(getAverageSpeed(), vehicle.getAverageSpeed()) &&
        Objects.equals(getMaxSpeed(), vehicle.getMaxSpeed());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getID(), getAverageSpeed(), getMaxSpeed());
  }
}
