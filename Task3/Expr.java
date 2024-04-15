package Task3;

public class Expr {
    public static double expr(int a, int b) {
        // Введите свое решение ниже
        if (b==0) {
            printSum(a,b);
            return 0;
        }
        else {
            printSum(a,b);
            return (double)a/b;
        }
       
    }
       
    public static void printSum(int a, int b) {
        // Введите свое решение ниже
       System.out.println(a+b);
    }
    
}
