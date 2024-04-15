package Homework_3;

public class LengthExeption extends RuntimeException {

    public LengthExeption(int l) {
        if (l > 6)
            System.out.println("Вы ввели больше данных");
        else
            System.out.println("Вы ввели меньше данных");
    }
}
