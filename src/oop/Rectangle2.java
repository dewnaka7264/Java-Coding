package oop;
class Rectangle2{
public static void main(String[]args){
    Rectangle rectangle=new Rectangle(10,5);
    double perimeter = rectangle.calculatePerimeter();
    double area = rectangle.calculateArea();

    System.out.println(area);
    System.out.println( perimeter);
    System.out.println(rectangle.getHeight());
    rectangle.setHeight(24);
    System.out.println(rectangle.getHeight());

}
}