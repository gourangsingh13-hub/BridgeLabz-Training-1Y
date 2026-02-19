import java.util.Scanner;

public class LineAndDistance {

    public static double findDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );
    }

    public static double[] findLineEquation(double x1, double y1,
                                            double x2, double y2) {

        if (x2 == x1) {
            System.out.println("Vertical line. Slope is undefined.");
            return new double[]{Double.NaN, Double.NaN};
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] equation = findLineEquation(x1, y1, x2, y2);

        System.out.println("Euclidean Distance: " + distance);

        if (!Double.isNaN(equation[0])) {
            System.out.println("Slope (m): " + equation[0]);
            System.out.println("Y-intercept (b): " + equation[1]);
            System.out.println("Equation of Line: y = " 
                    + equation[0] + "x + " + equation[1]);
        }
    }
}
