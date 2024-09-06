package LateObjects;

import java.util.Scanner;

public class P2_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter radiuus:");
        double radius= scanner.nextDouble();

        double area=Math.PI*Math.pow(radius,2);
        System.out.print("Area is:  "+area);
    }
}
