// 1431. Kids With the Greatest Number of Candies

package Array;

import java.util.ArrayList;

public class largestCandies {

    public static ArrayList<Boolean> kidsWithCandies(int arr[], int k) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        int largestCandies = largest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + k >= largestCandies) {
                list.add(true);
            } else {
                list.add(false);
            }
        }


        return list;
    }

    public static int largest(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 1, 2 };
        // System.out.println(Math.max(arr[0], arr[1]));
        System.out.println(kidsWithCandies(arr, 1));
    }
}
