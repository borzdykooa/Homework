package HomeworkSeven;

public abstract class Figure {

    public abstract double getArea();

    public abstract double getPerimeter();

    public String equalArea(Figure figure) {
        if (figure.getArea() == this.getArea()) {
            return "Площадь сравниваемых фигур одинаковая";
        } else {
            return "Площадь сравниваемых фигур разная";
        }
    }
}





