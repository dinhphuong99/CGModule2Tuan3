package exercise;

import java.util.Scanner;

public class Triangle {
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (this.side1 + this.side2 <= this.side3 || this.side1 + this.side3 <= this.side2
                || this.side2 + this.side3 <= this.side1 || this.side1 <= 0
                || this.side2 <= 0 && this.side3 <= 0)
            throw new IllegalTriangleException("Not a triangle");
        else
            System.out.println("Is a triangle");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of side1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter value of side2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter value of side3: ");
        double side3 = scanner.nextDouble();
        try {
            Triangle obj = new Triangle(side1,side2,side3);
        } catch (IllegalTriangleException m) {
            System.out.println("Exception occurred: " + m);//Ngoại lệ xảy ra
        }
    }
}
