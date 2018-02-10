package HomeworkTen.HomeworkTenTwo;

import java.util.Objects;

public class SportCar extends Car {

    private int maxSpeed;

    public SportCar(String brand, String model, int year, int engineVolume, String colour, int maxSpeed) {
        super(brand, model, year, engineVolume, colour);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return maxSpeed == sportCar.maxSpeed;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "\nSportCar{" + super.toString() +
                "maxSpeed=" + maxSpeed + "} ";
    }
}
