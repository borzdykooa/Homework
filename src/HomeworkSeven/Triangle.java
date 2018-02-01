package HomeworkSeven;

public class Triangle extends Figure implements HeightOfTriangle {

    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }


    @Override
    public String toString() {
        if (firstSide + secondSide < thirdSide
                || firstSide + thirdSide < secondSide
                || secondSide + thirdSide < firstSide) {
            return "Треугольника с такими сторонами не существует";
        } else {
            return "Фигура треугольник со сторонами " + firstSide + ", " + secondSide + " и " + thirdSide;
        }
    }

    @Override
    public double getArea() {
        return Math.sqrt((getPerimeter() / 2)
                * (getPerimeter() / 2 - firstSide)
                * (getPerimeter() / 2 - secondSide)
                * (getPerimeter() / 2 - thirdSide));
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double firstSideHeight() {
        return getArea() * 2 / firstSide;
    }

    @Override
    public double secondSideHeight() {
        return getArea() * 2 / secondSide;
    }

    @Override
    public double thirdSideHeight() {
        return getArea() * 2 / thirdSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }
}
