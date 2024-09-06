public class Example {
    // Static variable declared
    static int staticVariable;

    // Constructor attempting to initialize static variable like an instance variable
    public Example(int value) {
        staticVariable = value; // This will result in a compilation error
    }

    public static void main(String[] args) {
        Example obj = new Example(42);
        System.out.println("Static Variable: " + staticVariable);
    }
}
