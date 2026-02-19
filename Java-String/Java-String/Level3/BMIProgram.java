import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI and return status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightMeter = heightCm / 100.0;
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 40)
            status = "Overweight";
        else
            status = "Obese";

        return new String[] {String.format("%.2f", bmi), status};
    }

    // Method to process all members
    public static String[][] processBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            String[] bmiData = calculateBMI(data[i][0], data[i][1]);

            result[i][0] = String.valueOf(data[i][1]);  // Height
            result[i][1] = String.valueOf(data[i][0]);  // Weight
            result[i][2] = bmiData[0];                  // BMI
            result[i][3] = bmiData[1];                  // Status
        }

        return result;
    }

    // Method to display in tabular format
    public static void display(String[][] result) {

        System.out.printf("%-10s %-10s %-10s %-15s\n",
                "Height(cm)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    result[i][0], result[i][1],
                    result[i][2], result[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; // 10 rows, 2 columns

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Processing
        String[][] result = processBMI(data);

        // Display
        System.out.println("\n--- BMI Report ---");
        display(result);

        sc.close();
    }
}