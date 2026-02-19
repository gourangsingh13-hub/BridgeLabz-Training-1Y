import java.util.Arrays;

public class NumberChecker2 {

    public static int[] getDigits(int number) {
        String str = String.valueOf(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        return number % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits)
            freq[d][1]++;

        return freq;
    }

    public static void main(String[] args) {
        int number = 21;
        int[] digits = getDigits(number);

        System.out.println("Sum: " + sumDigits(digits));
        System.out.println("Sum of Squares: " + sumSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number, digits));

        System.out.println("Digit Frequency:");
        for (int[] row : digitFrequency(digits))
            if (row[1] > 0)
                System.out.println("Digit " + row[0] + ": " + row[1]);
    }
}
