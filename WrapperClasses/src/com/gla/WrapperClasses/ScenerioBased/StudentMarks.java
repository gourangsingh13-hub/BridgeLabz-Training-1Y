import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Object[] data = {"85", 95, Integer.valueOf(88), "null"};

        ArrayList<Integer> valid = new ArrayList<>();

        for (Object obj : data) {
            try {
                if (obj instanceof String) {
                    String s = (String) obj;
                    if (!s.equals("null"))
                        valid.add(Integer.parseInt(s));
                } else if (obj instanceof Integer) {
                    valid.add((Integer) obj);
                }
            } catch (Exception e) {

            }
        }

        int sum = 0;
        for (int i : valid) sum += i;

        System.out.println("Average: " + (double) sum / valid.size());
    }
}