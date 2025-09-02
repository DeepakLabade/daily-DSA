//1768. Merge Strings Alternately

package String;

public class MergeStrAlter {
    public static String mergeAlternatively(String a, String b) {
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            if (i < a.length()) {
                ans.append(a.charAt(i));
            }
            if(i < b.length()) {
                ans.append(b.charAt(i));
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String ans = mergeAlternatively("abc", "pqr");
        System.out.println(ans);
    }    
}
