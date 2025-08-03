//find most consecutive ones with replacing k 0's

public class maxOnes {

    public static int findOnes(int[] arr, int k) {
        int l = 0;
        int r = 0;
        int zeroes = 0;
        int max = 0;
        while (r < arr.length) {
            if (arr[r] == 0) {
                zeroes++;
            }
            while (zeroes > k) {
                l++;
                // System.out.println("print");
                if (arr[l] == 0) {
                    zeroes--;
                    l++;
                }
            }
            if (zeroes <= k) {
                max = Math.max(max, r - l + 1);
            }
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 0 , 1, 0, 0, 0, 1, 1, 1 };
        System.out.println(findOnes(arr, 4));
    }
}