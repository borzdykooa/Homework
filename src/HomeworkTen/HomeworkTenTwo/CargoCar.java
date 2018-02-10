package HomeworkTen.HomeworkTenTwo;

import java.util.Objects;

public class CargoCar extends Car {

    private int loadCapacity;

    public CargoCar(String brand, String model, int year, int engineVolume, String colour, int loadCapacity) {
        super(brand, model, year, engineVolume, colour);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoCar cargoCar = (CargoCar) o;
        return loadCapacity == cargoCar.loadCapacity;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), loadCapacity);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "\nCargoCar{" + super.toString() +
                "loadCapacity=" + loadCapacity +
                "} ";
    }
}
