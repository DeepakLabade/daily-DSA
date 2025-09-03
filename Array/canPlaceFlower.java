// 605. can place flower

package Array;

public class canPlaceFlower {
    public static boolean canPlaceFlower(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                boolean leftEmpty = (i == 0) || (arr[i - 1] == 0);
                boolean rightEmpty = (i == arr.length - 1) || (arr[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    k--;
                    if (k == 0)
                        return true;
                }
            }
        }
        return k <= 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1,0,1,0,1,0,1 };
        System.out.println(canPlaceFlower(arr, 1));
    }
}
