package HomeworkTen.HomeworkTenTwo;

import java.util.Objects;

public class FamilyCar extends Car {

    private int quantityOfPassengers;

    public FamilyCar(String brand, String model, int year, int engineVolume, String colour, int quantityOfPassengers) {
        super(brand, model, year, engineVolume, colour);
        this.quantityOfPassengers = quantityOfPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FamilyCar familyCar = (FamilyCar) o;
        return quantityOfPassengers == familyCar.quantityOfPassengers;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), quantityOfPassengers);
    }

    public int getQuantityOfPassengers() {
        return quantityOfPassengers;
    }

    public void setQuantityOfPassengers(int quantityOfPassengers) {
        this.quantityOfPassengers = quantityOfPassengers;
    }

    @Override
    public String toString() {
        return "\nFamilyCar{" + super.toString() +
                "quantityOfPassengers=" + quantityOfPassengers +
                "} ";
    }
}
