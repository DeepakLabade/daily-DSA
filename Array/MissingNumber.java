package Array;

public class MissingNumber {

    public static int findNumber(int[] arr) {
        int totalCnt = 0;
        int actualCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            totalCnt += i + 1;
            actualCnt += arr[i];
        }
        return totalCnt - actualCnt;
    }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 3, 4, 5 };
        System.out.println(findNumber(arr));
    }
}
