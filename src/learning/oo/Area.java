package learning.oo;
import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.printf("Triangle X area: %.4f%n", calcArea(x.a, x.b, x.c));
        System.out.printf("Triangle Y area: %.4f%n", calcArea(y.a, y.b, y.c));

        if(calcArea(x.a, x.b, x.c) > calcArea(y.a, y.b, y.c)) {
            System.out.println("Larger area X");
        } else {
            System.out.println("Larger area Y");
        }

    }

    public static double calcArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
