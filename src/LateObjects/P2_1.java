package LateObjects;

public class P2_1 {
    static double millimeters(double n){
        return n*inch_to_mm;

    }
    static final double inch_to_mm=25.4;
    static final double Letter_width=8.5;
    static final double Letter_height=11.0;
    public static void main(String[] args) {
        double letterwidthMM=millimeters(Letter_width);
        double letterheightMM=millimeters(Letter_height);
        System.out.println("Letter width"+letterwidthMM);
        System.out.println("Letter height"+letterheightMM);



    }
}
