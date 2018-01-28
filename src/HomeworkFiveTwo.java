import java.util.Scanner;

public class HomeworkFiveTwo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String romanNumber=scanner.nextLine();
        String arabicNumber = romanNumber.replace("VIII", "8");
        arabicNumber = arabicNumber.replace("VII", "7");
        arabicNumber = arabicNumber.replace("VI", "6");
        arabicNumber = arabicNumber.replace("IV", "4");
        arabicNumber = arabicNumber.replace("IX", "9");
        arabicNumber = arabicNumber.replaceAll("XXX$", "30");
        arabicNumber = arabicNumber.replaceAll("XXX", "3");
        arabicNumber = arabicNumber.replaceAll("XX$", "2");
        arabicNumber = arabicNumber.replaceAll("XX", "2");
        arabicNumber = arabicNumber.replaceAll("XL$", "40");
        arabicNumber = arabicNumber.replaceAll("XL", "4");
        arabicNumber = arabicNumber.replaceAll("LXXX$", "80");
        arabicNumber = arabicNumber.replaceAll("LXXX", "8");
        arabicNumber = arabicNumber.replaceAll("LXX$", "70");
        arabicNumber = arabicNumber.replaceAll("LXX", "7");
        arabicNumber = arabicNumber.replaceAll("LX$", "60");
        arabicNumber = arabicNumber.replaceAll("LX", "6");
        arabicNumber = arabicNumber.replaceAll("XC$", "90");
        arabicNumber = arabicNumber.replaceAll("XC", "9");
        arabicNumber = arabicNumber.replaceAll("DCCC$", "800");
        arabicNumber = arabicNumber.replaceAll("DCCC", "8");
        arabicNumber = arabicNumber.replaceAll("CCC$", "300");
        arabicNumber = arabicNumber.replaceAll("CCC", "3");
        arabicNumber = arabicNumber.replaceAll("CC$", "200");
        arabicNumber = arabicNumber.replaceAll("CC", "2");
        arabicNumber = arabicNumber.replaceAll("CD$", "400");
        arabicNumber = arabicNumber.replaceAll("CD", "4");
        arabicNumber = arabicNumber.replaceAll("DCC$", "700");
        arabicNumber = arabicNumber.replaceAll("DCC", "7");
        arabicNumber = arabicNumber.replaceAll("DC$", "600");
        arabicNumber = arabicNumber.replaceAll("DC", "6");
        arabicNumber = arabicNumber.replaceAll("CM$", "900");
        arabicNumber = arabicNumber.replaceAll("XL$", "40");
        arabicNumber = arabicNumber.replaceAll("XL", "4");
        arabicNumber = arabicNumber.replaceAll("LXXX$", "80");
        arabicNumber = arabicNumber.replaceAll("LXXX", "8");
        arabicNumber = arabicNumber.replaceAll("LXX$", "70");
        arabicNumber = arabicNumber.replaceAll("LXX", "7");
        arabicNumber = arabicNumber.replaceAll("LX$", "60");
        arabicNumber = arabicNumber.replaceAll("III", "3");
        arabicNumber = arabicNumber.replaceAll("II", "2");
        arabicNumber = arabicNumber.replaceAll("I", "1");
        arabicNumber = arabicNumber.replaceAll("V", "5");
        arabicNumber = arabicNumber.replaceAll("X$", "10");
        arabicNumber = arabicNumber.replaceAll("X", "1");
        arabicNumber = arabicNumber.replaceAll("L$", "50");
        arabicNumber = arabicNumber.replaceAll("L", "5");
        arabicNumber = arabicNumber.replaceAll("C$", "100");
        arabicNumber = arabicNumber.replaceAll("C", "1");
        arabicNumber = arabicNumber.replaceAll("D$", "500");
        arabicNumber = arabicNumber.replaceAll("D", "5");
        arabicNumber = arabicNumber.replaceAll("M$", "1000");
        arabicNumber = arabicNumber.replaceAll("M", "1");
        System.out.println(arabicNumber);
    }
}
