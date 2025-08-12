package Recursion;

import java.util.ArrayList;

public class subsequence {

    static void findSubsequence(int idx, int target, int sum, int arr[], ArrayList<Integer> ans) {
        if (idx == arr.length) {
            if(sum == target) {
                System.out.println(ans);
            }
            return;
        }
        ans.add(arr[idx]);
        sum += arr[idx];
        findSubsequence(idx + 1, target, sum, arr, ans);
        ans.remove(ans.size() - 1);
        sum -= arr[idx];
        findSubsequence(idx+1, target, sum, arr, ans);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<Integer> ans = new ArrayList<>();
        findSubsequence(0, 3, 0, arr, ans);
    }
}
