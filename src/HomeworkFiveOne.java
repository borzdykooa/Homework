import java.util.Scanner;

public class HomeworkFiveOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String stringWithoutSpaces = string.replace(" ", "");
        String lowStringWithoutSpaces = stringWithoutSpaces.toLowerCase();
        StringBuffer oldString = new StringBuffer(lowStringWithoutSpaces);
        oldString.reverse();
        if (lowStringWithoutSpaces.contentEquals(oldString)) {
            System.out.println("палиндром");
        } else {
            System.out.println("не палиндром");
        }
    }
}
