package Recursion;

public class factorial {

    public static int findFactorial(int num) {
        if (num == 1)
            return 1;
        int factorial = num * findFactorial(num - 1);
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }   
}
