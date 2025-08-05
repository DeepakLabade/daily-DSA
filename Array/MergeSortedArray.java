package Array;

public class MergeSortedArray {
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = n - 1;
        int a = m + n - 1;
        while (i > 0 && j > 0) {
            if (arr1[i] < arr2[j]) {
                arr1[a] = arr2[j];
                j--;
            } else {
                arr1[a] = arr1[i];
                i--;
            }
            a--;
        }

        while (j >= 0) {
            arr1[a--] = arr2[j--];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 0 };
        int[] arr2 = { 1 };
        merge(arr1, arr1.length - arr2.length, arr2, arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
