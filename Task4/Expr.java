package Task4;

public class Expr {
    public static String expr(char a) throws Exception {
        // Введите свое решение ниже
        if (a==' ') throw new RuntimeException("Пустая строка введена.");
        else return ("Ваш ввод - "+a);
    }
}
