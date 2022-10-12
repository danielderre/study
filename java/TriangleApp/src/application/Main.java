package application;
import entities.Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the measure of triangle X: ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("Enter the measure of triangle X: ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double areaX = x.area();
    double areaY = y.area();

    if (areaX > areaY) {
        System.out.println("Larger area: X");
    } else if (areaY > areaX) {
        System.out.println("Larger area: Y");
    } else {
        System.out.println("Areas are the same");
    }
    }
}