// 1358. Number of Substrings Containing All Three Characters

public class threeChar {

    public static int numberOfSubStr(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            String s = "";
            for (int j = i; j < str.length(); j++) {
                s = s + str.charAt(j);
                if (s.contains("a") && s.contains("b") && s.contains("c"))
                    cnt++;
            }   
        }

        return cnt;
    }

    public static int better(String s) {
        int len = s.length();
        int cnt = 0;
        String str = "";
        for (int i = 0; i < len; i++) {
            str = str + s.charAt(i);
            while (str.contains("a") && str.contains("b") && str.contains("c")) {
                cnt = cnt + (len - i);
                str = str.substring(1);
            }
        }

        return cnt;
    }

    public static int optimal(String s) {
        int len = s.length();
        int cnt = 0;
        int i = 0, j = 0;
        int freq[] = new int[3];
        while (j < len) {
            freq[s.charAt(j) - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                cnt = cnt + (len - j);
                freq[s.charAt(i) - 'a']--;
                i++;
            }
            j++;
        }

        return cnt;
    }    

    public static void main(String[] args) {
        System.out.println(numberOfSubStr("abcabc"));
        System.out.println(better("abcabc"));
        System.out.println(optimal("abcabc"));
    }    
}
