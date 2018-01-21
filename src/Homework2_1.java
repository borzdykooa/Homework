import java.util.Scanner;

public class Homework2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if (day<=0||day>31||month<=0||month>12||(year<=0)||((shortMonth (month))&&(day==31))||((month==2)&&(day==30))
                ||(!(isLeapYear(year))&&(day==29))) {
            System.out.println("This date doesn't exist");
        } else if ((isLeapYear(year)&&(day==29)&&(month==2))||(!(isLeapYear(year))&&(day==28)&&(month==2))) {
            System.out.println("01." + "03." + year);
        } else if (day==31&&month==12) {
            System.out.println("01.01."+(++year));
        } else if ((shortMonth (month)&&(day==30))||(longMonth (month)&&(day==31)&&!(month==12))) {
            System.out.println("01." + (++month) + "." + year);

        } else {

            System.out.println(++day+"." + month + "." + year);
        }


    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0;
    }
    private static boolean shortMonth (int month) {
        return month == 2 || month == 4 || month == 6 || month == 9 || month == 11;
    }
    private static boolean longMonth (int month) {
        return month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
    }


}
