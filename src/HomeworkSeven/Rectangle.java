package HomeworkSeven;

public class Rectangle extends Figure implements DiagonalOfRectangle {

    private int heith;
    private int width;

    public Rectangle(int heith, int width) {
        this.heith = heith;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Фигура прямоугольник с высотой " + heith + " и шириной " + width;
    }

    @Override
    public double getArea() {
        return heith * width;
    }

    @Override
    public double getPerimeter() {
        return heith * 2 + width * 2;
    }

    @Override
    public double diagonalOfRectangle() {
        return Math.sqrt(heith * heith + width * width);
    }

    public int getHeith() {
        return heith;
    }

    public int getWidth() {
        return width;
    }
}
