package Homework_3;

public class Check {
    public boolean cheking(String[] arr) {
        if (arr.length != 6)
            throw new LengthExeption(arr.length);
        if (!(arr[0] instanceof String) && !(arr[1] instanceof String) && !(arr[2] instanceof String))
            throw new RuntimeException("Не верно введены ФИО");

        String[] date = arr[3].split("\\.");
        if (date.length != 3)
            throw new RuntimeException("Не верно введена дата рождения ");
        if (date[0].length() != 2 || date[1].length() != 2 || date[2].length() != 4)
            throw new RuntimeException("Не верно введена дата рождения");

        try {
            Integer.parseInt(arr[4]);
            if ((arr[4].contains("+")) || (arr[4].contains("-")))
                throw new RuntimeException("Не верно введен номер телефона");
        } catch (NumberFormatException e) {
            System.out.println("Не верно введен номер телефона");
        }

        String gender = arr[5];
        if (!gender.equals("m") && !gender.equals("f"))
            throw new RuntimeException("Не верно введен пол");
        return true;
    }
}
