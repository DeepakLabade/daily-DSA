import java.util.ArrayList;

public class containerWithMostWater {

    public static int totalWater(ArrayList<Integer> height) {
        int i = 0;
        int j = height.size() - 1;
        int maxWater = 0;
        for (i = 0; j > i;) {
            maxWater = Math.max(maxWater, Math.min(height.get(i), height.get(j)) * (j - i));
            if (height.get(i) < height.get(j)) {
                i++;
            } else if (height.get(j) < height.get(i)) {
                j--;
            } else {
                i++;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println(totalWater(height));
    }
}
