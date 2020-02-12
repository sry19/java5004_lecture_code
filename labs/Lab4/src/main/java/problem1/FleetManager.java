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

  //TripReport drive(Vehicle vehicle, Float distance, Integer duration, Float speed) {
   // if (validateLawsOfPhysics(duration, distance, speed) || validateSpeed(speed)) {
   //   return new TripReport(vehicle, speed, distance, duration);
  //  } else throw new InputMismatchException("Vehicle moving faster than the speed of light!");
 // }

//  TripRerport drive (Boat boat, Float distance){
    //
 // }
 // Tripreport drive (Train train, Float distance){}
//  TriReport drive (Bus bus, Float distance){}
}
