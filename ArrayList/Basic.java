import java.util.ArrayList;

public class Basic {

    public static void twoDList() {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        
        System.out.println(mainList);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(4);
        list.add(6);

        // System.out.println(list);
        twoDList();
    }
}