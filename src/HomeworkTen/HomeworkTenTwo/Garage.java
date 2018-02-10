package HomeworkTen.HomeworkTenTwo;

import java.util.Map;

public class Garage {

    private Map<Car, Integer> carList;

    public Garage(Map<Car, Integer> carList) {
        this.carList = carList;
    }

    public static void parking(Map<Car, Integer> carList, Car car) {
        if (carList.containsKey(car)) {
            carList.put(car, carList.get(car) + 1);
        } else {
            carList.put(car, 1);
        }
        System.out.println("Следующая машина запаркована: " + car + '\n' + carList.toString());
    }

    public static void departure(Map<Car, Integer> carList, Car car) {
        if (carList.containsKey(car)) {
            if (carList.get(car) == 1) {
                carList.remove(car);
                System.out.println("Следующая машина выехала из гаража: " + car + '\n' + carList.toString());
            } else {
                carList.replace(car, carList.get(car), carList.get(car) - 1);
                System.out.println("Следующая машина выехала из гаража: " + car + '\n' + carList.toString());
            }
        } else {
            System.out.println("Следующей машины в гараже нет: " + car);
        }
    }

    public static void quantityOfCars(Map<Car, Integer> carList, Car car) {
        if (carList.containsKey(car)) {
            System.out.println("Количество следующих авто: " + carList.get(car) + car);
        } else {
            System.out.println("Следующих авто в гараже нет: " + car);
        }
    }

    public Map<Car, Integer> getCarList() {
        return carList;
    }

    public void setCarList(Map<Car, Integer> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "carList=" + carList +
                '}';
    }
}
