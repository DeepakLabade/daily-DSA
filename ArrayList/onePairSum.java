import java.util.ArrayList;

public class onePairSum {

    public static boolean findTarget(ArrayList<Integer> list, int target) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum == target) {
                return true;
            }

            if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(findTarget(list, target));
    }
}
