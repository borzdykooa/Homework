package HomeworkSeven;

public class Square extends Rectangle {

    private int side;

    public Square(int heith, int width) {
        super(heith, width);
        if (super.getHeith() == super.getWidth()) {
            side = super.getHeith();
            side = super.getWidth();
        } else {
            System.out.println("Неверно заданы параметры квадрата");
        }
    }

    @Override
    public String toString() {
        return "Фигура квадрат со стороной " + side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}

