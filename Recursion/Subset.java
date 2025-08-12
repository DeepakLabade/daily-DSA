package Recursion;

import java.util.*;

public class Subset {

    public static ArrayList<ArrayList<Integer>> findSubset(int[] arr) {
        ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
        find(arr, 0, allList, new ArrayList<>());

        return allList;
    } 

    public static void find(int[] arr, int idx, ArrayList<ArrayList<Integer>> allList, ArrayList<Integer> list) {
        if (idx == arr.length) {
            allList.add(new ArrayList<>(list));
            return;
        }
        
        list.add(arr[idx]);
        find(arr, idx + 1, allList, list);
        list.remove(list.size() - 1);
        find(arr, idx + 1, allList, list);

        return;
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(findSubset(arr));
    }
}
