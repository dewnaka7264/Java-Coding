import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");

        String name=scanner.next();
        String Surname=scanner.next();
        System.out.println("Your name is: "+name+Surname);
    }
}