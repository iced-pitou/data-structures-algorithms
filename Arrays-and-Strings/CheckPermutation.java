public class CheckPermutation {

    private static boolean checkPermutation(String w1, String w2) {
        if (w1.length() != w2.length())
            return false;

        int letterCount = 0;
        for (int i = 0; i < w1.length(); i++)
            letterCount += (int) w1.charAt(i) - (int) w2.charAt(i);

        return letterCount == 0;
    }

    public static void main(String[] args) {
        String[] words = { "word", "orwd" };
        System.out.print(String.format("Words \"%s\" and \"%s\" are", words[0], words[1]));
        if (checkPermutation(words[0], words[1])) {
            System.out.println(" anagrams :)");
        } else {
            System.out.println(" not anagrams :(");
        }
    }
}
