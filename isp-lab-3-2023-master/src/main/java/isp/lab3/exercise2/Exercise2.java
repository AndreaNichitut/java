package isp.lab3.exercise2;

public class Exercise2 {
    private int length=2;
    private int width=1;
    private String color="red";

    /*public Exercise2(int length , int width) {
        this.length = length;
        this.width = width;
    }
    public Exercise2(int length , int width , String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }*/
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public String getColor() {
        return color;
    }
    public int getPerimeter() {
        return 2*length+2*width;
    }
    public int getArea() {
        return length*width;
    }

    public static void main(String[] args) {
        Exercise2 rectangle = new Exercise2();
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}
