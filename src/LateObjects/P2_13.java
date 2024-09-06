package LateObjects;

import java.util.Scanner;

public class P2_13 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number with a comma");
        String numberWithComma=scanner.next();

        String numberWithoutComma=numberWithComma.replace(",","");
        System.out.println(numberWithoutComma);
        int number=Integer.parseInt(numberWithoutComma);
        System.out.println(number);
    }
}
