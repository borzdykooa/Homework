package HomeworkSeven;

import java.awt.*;

public final class ShapeUtils {

    public static void instanceOfTriangle(Figure figure) {
        if (figure instanceof Triangle) {
            System.out.println("Фигура является треугольником");
        } else {
            System.out.println("Фигура не является треугольником");
        }
    }

    public static void instanceOfRectangle(Figure figure) {
        if (figure instanceof Rectangle) {
            System.out.println("Фигура является прямоугольником");
        } else {
            System.out.println("Фигура не является прямоугольником");
        }
    }
}
