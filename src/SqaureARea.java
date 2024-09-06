import java.util.Scanner;

public class SqaureARea {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter te side of Square: ");
        int Sidelength=scanner.nextInt();


        int AREA=(int) Math.pow(Sidelength,2);

        System.out.println("Area is: "+AREA);

    }
}
