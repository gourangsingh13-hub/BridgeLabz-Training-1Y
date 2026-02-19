public class RemoveCharacter {

    public static String removeChar(String str, char ch) {
        String result = "";

        for (char c : str.toCharArray()) {
            if (c != ch)
                result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeChar("Hello World", 'l'));
    }
}
