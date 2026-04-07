public class WrapperMethods {
    public static void main(String[] args) {
        int i = Integer.parseInt("123");
        double d = Double.parseDouble("3.14");
        boolean b = Boolean.parseBoolean("true");
        String binary = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(binary);
        System.out.println(isDigit);
        System.out.println(upper);
    }
}