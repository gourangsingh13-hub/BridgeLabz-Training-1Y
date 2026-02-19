import java.util.Arrays;

public class ZaraBonusProgram {

    public static double[][] generateEmployeeData(int size) {
        double[][] data = new double[size][2]; 

        for (int i = 0; i < size; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int)(Math.random() * 10) + 1;        // 1–10 years
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];

            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    public static void displaySummary(double[][] oldData, double[][] newData) {

        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");

        for (int i = 0; i < oldData.length; i++) {

            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];

            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n",
                    (i+1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t\t%.2f\t%.2f\n",
                totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {

        int numberOfEmployees = 10;

        double[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] updatedData = calculateBonus(employeeData);

        displaySummary(employeeData, updatedData);
    }
}
