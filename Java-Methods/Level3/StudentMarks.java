import java.util.Random;
import java.util.Scanner;

public class StudentMarks {

    public static int[][] generateMarks(int n) {
        Random r = new Random();
        int[][] marks = new int[n][3];

        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                marks[i][j] = 40 + r.nextInt(61); // 40-100

        return marks;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for(int i=0;i<n;i++){
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;

            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%s\n",
                    marks[i][0],marks[i][1],marks[i][2],
                    total,avg,per,getGrade(per));
        }
    }
}