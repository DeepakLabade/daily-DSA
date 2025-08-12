package Recursion;
import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> findCombination(int[] arr, int target) {
        List<List<Integer>> allList = new ArrayList<>();
        findSum(arr, 0, allList, new ArrayList<>(), target);

        return allList;
    }

    public static void findSum(int[] arr, int idx, List<List<Integer>> allList, List<Integer> list, int target) {
        if (target == 0) {
            allList.add(new ArrayList<>(list));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            list.add(arr[i]);
            findSum(arr, idx, allList, list, target-arr[i]);
            list.remove(list.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        System.out.println(findCombination(arr, 2));
    }
}
