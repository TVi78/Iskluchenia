package Task1;
import Task1.IsFloat1;

public class Printer {
    public static void main(String[] args) {
        String input;

        // При отправке кода на Выполнение, вы можете варьировать эти параметры
                if (args.length == 0) {
                    input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан
                } 
                else {
                    input = args[0];
                }
        
                float result = IsFloat1.isFloat("7dd");
                System.out.println(result);
        
    }
}
