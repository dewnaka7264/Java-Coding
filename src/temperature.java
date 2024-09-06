import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Celsius temperature: ");
        double temp= scanner.nextDouble();
        double fahrenheit = (temp * 9/5) + 32;

System.out.println(temp+" celcius into fahrenheit is "+fahrenheit+" f");


    }
}
