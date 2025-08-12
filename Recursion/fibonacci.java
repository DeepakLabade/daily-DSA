package Recursion;

public class fibonacci {

    static int findFibonacci(int num) {
        if (num == 0 || num == 1)
            return num;
        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }
    public static void main(String[] args) {
        int num = findFibonacci(9);
        System.out.println(num);
    }   
}
