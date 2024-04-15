package Task1;

/**
 * IsFloat
 */
class IsFloat1 {
    public static float isFloat(String input) {
// Введите свое решение ниже        
  try{
    // float value=Float.parseFloat(input)/0;
    return Float.parseFloat(input);
  }
  catch (NumberFormatException e){
    System.out.println("Your input is not a float number. Please, try again."+Float.NaN);
    return Float.NaN;
  }
}
}