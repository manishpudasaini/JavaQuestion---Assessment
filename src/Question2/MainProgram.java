package Question2;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args)  {
        ParkingLotImp parkingLotImp = new ParkingLotImp();
        Scanner sc = new Scanner(System.in);
        char continueLoop ;

        do{
            System.out.println("<----------------------------------------------------->");
            System.out.println("1. To park the car in parking lot. \n2. To see all car in Parking lot");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:

                    System.out.println("<----------------------------------------------------->");
                    System.out.println("Enter the detail of cars to park");
                    System.out.println("<----------------------------------------------------->");

                    System.out.println("Enter name of car :: ");
                    String carName = sc.nextLine();


                    System.out.println("Enter license no :: ");
                    String licNo = sc.nextLine();

                    Car car = new Car(carName,licNo);

                    try{
                        parkingLotImp.parkCar(car);

                    }catch (ParkingLotImp e){
                        System.out.println("Exception occur :: "+e);
                    }

                    break;

                case 2:
                    parkingLotImp.carsParkedInParkingLot();
                    break;
            }

            System.out.println("Enter yes to continue no to stop (Y/N)");
            continueLoop = sc.nextLine().charAt(0);


        }while (continueLoop=='y');


    }
}
