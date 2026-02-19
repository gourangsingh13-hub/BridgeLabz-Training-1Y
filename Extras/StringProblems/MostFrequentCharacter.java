public class MostFrequentCharacter {

    public static char mostFrequent(String str) {
        int[] freq = new int[256];
        char maxChar = ' ';
        int max = 0;

        for (char ch : str.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > max) {
                max = freq[ch];
                maxChar = ch;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println("Most Frequent Character: '" + mostFrequent("success") + "'");
    }
}
