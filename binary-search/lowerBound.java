public class lowerBound {

    public static int findLowerBound(int[] arr, int k) {
        int min = 0;
        int max = arr.length - 1;
        int idx = -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                idx = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 23, 25 };
        System.out.println(findLowerBound(arr, 2));
    }
}
