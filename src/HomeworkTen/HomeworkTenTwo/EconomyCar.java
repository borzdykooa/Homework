package HomeworkTen.HomeworkTenTwo;

import java.util.Objects;

public class EconomyCar extends Car {

    private double fuelConsumption;

    public EconomyCar(String brand, String model, int year, int engineVolume, String colour, double fuelConsumption) {
        super(brand, model, year, engineVolume, colour);
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EconomyCar that = (EconomyCar) o;
        return fuelConsumption == that.fuelConsumption;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), fuelConsumption);
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "\nEconomyCar{" + super.toString() +
                "fuelConsumption=" + fuelConsumption +
                "} ";
    }
}
