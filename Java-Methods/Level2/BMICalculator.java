import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            double heightInMeter = arr[i][1] / 100.0;   // convert cm to meter
            arr[i][2] = arr[i][0] / (heightInMeter * heightInMeter);
        }
    }

    public static String getStatus(double bmi) {
        if (bmi <= 18.4)
            return "Underweight";
        else if (bmi <= 24.9)
            return "Normal";
        else if (bmi <= 39.9)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3]; 

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        System.out.println("\n---- BMI REPORT ----");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + persons[i][0] + " kg");
            System.out.println("Height: " + persons[i][1] + " cm");
            System.out.printf("BMI: %.2f\n", persons[i][2]);
            System.out.println("Status: " + getStatus(persons[i][2]));
            System.out.println("----------------------");
        }

        sc.close();
    }
}