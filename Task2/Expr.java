package Task2;

public class Expr {
    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        try{
            // float value=Float.parseFloat(input)/0;
            if (d!=0) { 
                System.out.println("intArray[8] / d = "+intArray[8]+" / "+d+" = "+(double)intArray[8] / d);     
            }
            
            return intArray[8] / d;
          }
          catch (ArrayIndexOutOfBoundsException e){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Float.NaN;
          }
          catch (ArithmeticException e){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Float.NaN;
          }
       
           }
    
}
