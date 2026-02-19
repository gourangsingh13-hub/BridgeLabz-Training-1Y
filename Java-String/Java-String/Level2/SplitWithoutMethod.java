import java.util.Scanner;

public class SplitWithoutMethod {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitText(String text) {
        int len = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                wordCount++;

        String[] words = new String[wordCount];

        int start = 0, index = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] manual = splitText(text);
        String[] builtin = text.split(" ");

        System.out.println("Arrays same? " + compareArrays(manual, builtin));
    }
}
