import java.util.Scanner;

public class Homework2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        final int e=20;
        final int f=10;


        if ((((a+c<=e)&&(b<=f)&&(d<=f))||((a+c<=f)&&(b<=e)&&(d<=e))||((a+d<=e)&&(b<=f)&&(c<=f))
                ||((a+d<=f)&&(b<=e)&&(c<=e))) &&(a>0&&b>0&&c>0&&d>0)) {
            System.out.println("дома помещаются");
        }else if (a<=0||b<=0||c<=0||d<=0){
            System.out.println("не существует домов такого размера");
        } else {
            System.out.println("дома не помещаются");
        }


    }

 }
