package HomeworkTen.HomeworkTenTwo;

import java.util.HashMap;
import java.util.Map;

public class GarageDemo {

    public static void main(String[] args) {

        Car firstCar = new EconomyCar("Daewoo", "Matiz", 2009, 800, "green", 5.2);
        Car secondCar = new EconomyCar("Ford", "Fiesta", 2010, 1500, "white", 6.5);
        Car thirdCar = new SportCar("VW", "CC", 2012, 2200, "black", 250);
        Car fourthCar = new CargoCar("Toyota", "Tundra", 2008, 2200, "white", 3500);
        Car fifthCar = new SportCar("Ferrari", "Testarossa", 2015, 2200, "black", 315);
        Car sixthCar = new FamilyCar("Ford", "Galaxy", 2010, 2200, "red", 7);

        Map<Car, Integer> carList = new HashMap<>();
        carList.put(firstCar, 5);
        carList.put(secondCar, 2);
        carList.put(thirdCar, 1);
        carList.put(fourthCar, 5);
        carList.put(fifthCar, 5);
        carList.put(sixthCar, 2);

        System.out.println(carList.toString());
        System.out.println();

        Garage.parking(carList, new SportCar("VW", "CC", 2012, 2200, "black", 250));
        System.out.println();

        Garage.parking(carList, new EconomyCar("Ford", "Focus", 2012, 1500, "blue", 7.0));
        System.out.println();

        Garage.departure(carList, new FamilyCar("Ford", "Galaxy", 2010, 2200, "red", 7));
        System.out.println();

        Garage.departure(carList, new CargoCar("VW", "Sprinter", 2006, 2500, "white", 3500));
        System.out.println();

        Garage.quantityOfCars(carList, new EconomyCar("Daewoo", "Matiz", 2009, 800, "green", 5.2));
    }
}