package Stars;

public class Pyramid {
    public static void main(String[] args) throws InterruptedException {
        int num=10;
        for (int i=0;i<10;i++){
            for (int k=10-i;k>1;k--)
                System.out.print(" ");


            for (int j=0;j<i;j++){
                System.out.print("* ");

            }
            System.out.println();

            

        }

    }
}
