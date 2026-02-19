public class ReplaceWord {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        String sentence = "Java is easy to learn";
        System.out.println(replaceWord(sentence, "easy", "powerful"));
    }
}
