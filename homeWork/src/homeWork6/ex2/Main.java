package homeWork6.ex2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by tish on 13.02.14.
 * Программа делает вот что - ей на вход передается путь к папке,
 * в которой находятся текстовые файлы.
 * Программа сортирует названия по длине,
 * и сливает всю текстовую информацию, в один большой текстовый файл.
 * Начиная с файла с самым длинным названием и так далее... к самому короткому.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Укажите путь к папке с файлами:");
        Scanner scn = new Scanner(System.in);
        String path = scn.nextLine();

        File pathName = new File(path);
        String[] fileName = pathName.list();
        System.out.println();

        System.out.println("В данной папке находятся такие файлы:");
        for (int i = 0; i < fileName.length; i++) {
            System.out.println(fileName[i]);
        }

        for (int i = fileName.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (fileName[j].length() <= fileName[j + 1].length()) {
                    String temp = fileName[j];
                    fileName[j] = fileName[j + 1];
                    fileName[j + 1] = temp;
                }
            }
        }
        PrintWriter out = new PrintWriter(path + "\\report.txt");
        for (int i = 0; i < fileName.length; i++) {
            out.println(fileName[i]);
        }
        out.close();
        System.out.println();

        System.out.println("Имена всех файлов с папки " + path + " записаны в файл report.txt,");
        System.out.println("в отсортированом порядке, по убыванию длины имени файла.");
    }
}
