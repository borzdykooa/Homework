import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = scanner.nextInt();
        if (numberOfDays<=0) {
            System.out.println("Количество дней должно быть больше 0");
        } else {
            System.out.println("Количество дней: " + (numberOfDays));
        }

        int sum = 0;
        int maxRainfall = 0;


        for (int i = 0; i < numberOfDays; i++) {
            int rainfall = scanner.nextInt();
            sum += rainfall;

            if (maxRainfall < rainfall) {
                maxRainfall = rainfall;
            }

        }
        System.out.println("Сумма осадков за период: " + sum);
        System.out.println("Среднее количество осадков за период:" + sum / numberOfDays);
        System.out.println("Максимальное количество осадков за период:" + maxRainfall);
    }
}
