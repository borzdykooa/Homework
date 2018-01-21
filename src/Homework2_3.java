import java.util.Scanner;

public class Homework2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();




        if (isPositive (b,a,c)) {
            System.out.println("один корень равен "+ ((-b+(Math.sqrt (discriminant (b,a,c))))/(2*a))
                    +", второй корень равен "+((-b-(Math.sqrt (discriminant (b,a,c))))/(2*a)));
        } else if (isZero (b,a,c)) {
            System.out.println("оба корня равны " + (-b / (2 * a)));
        } else if (a==0){
            System.out.println("уравнение не является квадратным");
        } else {
            System.out.println("дискриминант отрицательный, действительных корней нет");
        }


    }

    private static boolean isPositive(double b,double a,double c) {
        return (b*b - 4 * a * c)>0&&a!=0;
    }
    private static boolean isZero (double b,double a,double c) {
        return ((b * b - 4 * a * c) == 0)&&(a!=0);
    }

    private static double discriminant (double b,double a,double c) {
        return (b*b - 4 * a * c);
    }

}
