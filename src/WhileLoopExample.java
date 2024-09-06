public class WhileLoopExample {
    public static void main(String[] args) throws InterruptedException {
        int count = 1;

        // While loop to print numbers from 1 to 5
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++; // Increment the counter
        }

        System.out.println("Loop ended");
    }
}
