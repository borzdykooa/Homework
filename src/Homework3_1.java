import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; number != 0; i++) {
            int rest = number % 10;
            number /= 10;
            sum += rest;
        }

        System.out.print("Сумма цифр числа: " + sum);

    }
}
