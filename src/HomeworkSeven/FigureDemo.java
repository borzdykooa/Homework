package HomeworkSeven;

public class FigureDemo {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(6, 8);
        System.out.println(firstRectangle);
        System.out.println("Диагональ равна " + firstRectangle.diagonalOfRectangle());
        System.out.println("Площадь равна " + firstRectangle.getArea());
        System.out.println();

        Triangle firstTriangle = new Triangle(10, 6, 8);
        System.out.println(firstTriangle);
        System.out.println("Площадь равна " + firstTriangle.getArea());
        System.out.println(firstTriangle.equalArea(firstRectangle));
        System.out.println();

        Square firstSquare = new Square(6, 6);
        System.out.println(firstSquare);
        System.out.println("Площадь равна " + firstSquare.getArea());
        ShapeUtils.instanceOfRectangle(firstSquare);
        System.out.println();

        EquilateralTriangle firstEquilateralTriangle = new EquilateralTriangle(3, 3, 3);
        System.out.println(firstEquilateralTriangle);
        ShapeUtils.instanceOfTriangle(firstEquilateralTriangle);
        System.out.println("Высота треугольника равна " + firstEquilateralTriangle.firstSideHeight());
        System.out.println();

        Circle firstCircle = new Circle(5);
        System.out.println(firstCircle);
        System.out.println("Периметр равен " + firstCircle.getPerimeter());
        System.out.println();

        Triangle secondTriangle = new Triangle(2, 3, 10);
        System.out.println(secondTriangle);
    }
}
