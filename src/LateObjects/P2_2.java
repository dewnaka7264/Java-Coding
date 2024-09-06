package LateObjects;


import java.util.Scanner;
public class P2_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number: ");
        double length = scan.nextDouble();
        scan.close();

        double square=length*length;
        double cube = Math.pow(length,3);

        double fourthPower=Math.pow(length,4);

        System.out.println("square  "+square);
        System.out.println("cube   "+cube);
        System.out.println("fourthpower  "+fourthPower);
    }
}
