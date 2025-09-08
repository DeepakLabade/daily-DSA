package String;

public class reverseVowels {

    public static String reverseVowel(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        char[] chars = str.toCharArray(); // Convert to char array for mutation
        int i = 0, j = str.length() - 1;
        String vowels = "aeiouAEIOU";

        while (i < j) {
            // Move left pointer to next vowel
            while (i < j && !vowels.contains(String.valueOf(chars[i]))) {
                i++;
            }

            // Move right pointer to previous vowel
            while (i < j && !vowels.contains(String.valueOf(chars[j]))) {
                j--;
            }

            // Swap vowels
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String ans = reverseVowel("leetcode");
        System.out.println(ans);
    }
}
