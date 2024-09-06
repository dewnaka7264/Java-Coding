public class StaticvsNon {
    // Non-static (instance) variable
    int instanceVariable;

    // Static (class) variable
    static int staticVariable;

    // Constructor
    public StaticvsNon(int instanceVariable) {
        this.instanceVariable = instanceVariable;

    }

    // Other methods...

    public static void main(String[] args) {
        // Creating instances of the class
        StaticvsNon obj1 = new StaticvsNon(10);
        StaticvsNon obj2 = new StaticvsNon(20);

        // Accessing instance variable
        System.out.println("Instance Variable of obj1: " + obj1.instanceVariable);
        System.out.println("Instance Variable of obj2: " + obj2.instanceVariable);

        // Accessing static variable
        System.out.println("Static Variable: " + StaticvsNon.staticVariable);
    }
}
