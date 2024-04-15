package Homework_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        String data = scaner.nextLine();
        String[] arr = data.split(" ");
        Check ch1 = new Check();
        ch1.cheking(arr);
        String fn = arr[0] + ".txt";
        try (FileWriter fr = new FileWriter(fn, true)) {
            fr.write(String.format("<%s><%s><%s><%s><%s><%s>\n", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
            fr.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
