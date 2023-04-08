package Question2;

import java.util.List;

public interface ParkingLot {
     int parkCar(Car car) throws ParkingLotImp;
    boolean isParkingLotFull();
    List<Car> carsParkedInParkingLot();

}
