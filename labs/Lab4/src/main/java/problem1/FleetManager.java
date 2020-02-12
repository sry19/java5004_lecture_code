package problem1;

import java.util.InputMismatchException;

public class FleetManager {
  private static final Float DEFAULT_DISTANCE = 100f;

  public FleetManager() {
  }

  TripReport drive(Float distance, Vehicle vehicle) {
    Integer duration = vehicle.getDuration(distance);
    return new TripReport(vehicle, vehicle.getAverageSpeed(), distance, duration);
  }

  TripReport drive(Vehicle vehicle) {
    return drive(DEFAULT_DISTANCE, vehicle);
  }

  TripReport drive(Vehicle vehicle, Float distance, Integer duration) {
    return new TripReport(vehicle, vehicle.getAverageSpeed(), distance, duration);
  }

  TripReport drive(Vehicle vehicle, Float distance, Integer duration, Float speed) {
    return null;
   }

  TripReport drive (Boat boat, Float distance){
    return null;
  }

  TripReport drive (Train train, Float distance) {
    return null;
  }
}
