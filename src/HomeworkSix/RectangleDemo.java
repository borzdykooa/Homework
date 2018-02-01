package HomeworkSix;

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(new Point(-3, 5), new Point(6, -1));
        System.out.println("Диагональ прямоугольника составляет " + firstRectangle.diagonal());
        System.out.println("Площадь прямоугольника составляет " + firstRectangle.area());
    }
}
