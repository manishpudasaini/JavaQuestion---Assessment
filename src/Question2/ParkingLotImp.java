package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingLotImp extends Exception implements ParkingLot {
    ParkingLotImp(){}
    public ParkingLotImp(String errorMsg){
        super(errorMsg);
    }
    // Maximum capacity to park the car
    private static final int parkLotCapacity = 10;
    private List<Car> cars = new ArrayList<>();


    @Override
    public int parkCar(Car car) throws ParkingLotImp {
        if (isParkingLotFull()) {
            throw new ParkingLotImp("Parking lot is full so you cannot park your car");
        }else {
            //car.size()=0 so id start from 1 by adding it by 1
            int spotId = cars.size() + 1;
            car.setSpotId(spotId);
            cars.add(car);

            System.out.println("Car parked in parking lot..");
            return spotId;
        }
    }

    @Override
    public boolean isParkingLotFull() {
        return cars.size() >= parkLotCapacity;
    }
    @Override
    public List<Car> carsParkedInParkingLot() {
        Collections.sort(cars, Comparator.comparing(Car::getMake)); // Sort cars by make
        for (Car car : cars) {
            System.out.println(car.getSpotId() + " - " + car.getMake() + " - " + car.getLicNo());
        }
        return cars;
    }

}
