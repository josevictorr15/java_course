package learning.oo;
import java.util.Locale;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        System.out.printf("Triangle X area: %.4f%n: ", calcArea(xA, xB, xC));
        System.out.printf("Triangle Y area: %.4f%n", calcArea(yA, yB, yC));

        if(calcArea(xA, xB, xC) > calcArea(yA, yB, yC)) {
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
