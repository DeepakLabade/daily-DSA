// 1071. Greatest Common Divisor of Strings

package String;

public class commonDivisor {
    public static String gcdOfStrings(String a, String b) {
        if (!(a + b).equals(b + a)) {
            return "";
        }
        int gcd = gcdOfNum(a.length(), b.length());
        return a.substring(0, gcd);
    }

    public static int gcdOfNum(int a, int b) {
        return b == 0 ? a : gcdOfNum(b, a % b);
    }

    public static void main(String[] args) {
        String ans = gcdOfStrings("ABABAB", "ABAB");
        System.out.println(ans);
    }
}
