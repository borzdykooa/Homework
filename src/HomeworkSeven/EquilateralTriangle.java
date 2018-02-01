package HomeworkSeven;

public class EquilateralTriangle extends Triangle {

    private int side;

    public EquilateralTriangle(int firstSide, int secondSide, int thirdSide) {
        super(firstSide, secondSide, thirdSide);
        if (firstSide == secondSide && secondSide == thirdSide) {
            side = super.getFirstSide();
            side = super.getSecondSide();
            side = super.getThirdSide();
        } else {
            System.out.println("Треугольник не является равносторонним");
        }
    }

    @Override
    public String toString() {
        return "Фигура равносторонний треугольник со сторонами " + side;
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }

    @Override
    public double getArea() {
        return side * side * Math.sqrt(3) / 4;
    }
}
