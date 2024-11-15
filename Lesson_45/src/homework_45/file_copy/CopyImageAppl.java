package homework_45.file_copy;

/*
В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main. Имена файлов принимать через массив args. Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты. Результат должен быть выведен на консоль в виде сообщения.
C:\JAVA\AIT-TR-Java-Cours-2024\chess-horse.png C:\JAVA\AIT-TR-Java-Cours-2024\chess-horse1.png

 */

import java.io.FileInputStream;
import java.io.IOException;

public class CopyImageAppl {
    public static void main(String[] args) {

        // String[] args - он отвечает за получение аргументов
        // проверяем, что аргументов именно 2
        if(args.length != 2 ){
            System.out.println("Sorry Leonid, I'm too lazy to insert arguments into the launch menu :) No arguments provided. Using default file paths...");
            args = new String[] {
                    "C:\\JAVA\\AIT-TR-Java-Cours-2024\\chess-horse.png",
                    "C:\\JAVA\\AIT-TR-Java-Cours-2024\\chess-horse1.png"
            };
        }
        // print file names
        // System.out.println("Source file: " + args[0]);
        // System.out.println("Destination file: " + args[1]);

        try (FileInputStream fis = new FileInputStream(args[0]);
             FileInputStream fis2 = new FileInputStream(args[1])) {

            int byte1, byte2;
            int position = 0;

            // Сравниваем содержимое файлов по байтам
            while ((byte1 = fis.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.printf("Files differ at byte %d.%n", position);
                    return;
                }
                position++;
            }

            // Проверяем, если один файл длиннее другого
            if (fis.read() != -1 || fis2.read() != -1) {
                System.out.println("Files differ: their lengths are different.");
            } else {
                System.out.println("Files are identical.Sorry Leonid, I'm too lazy to insert arguments into the launch menu :)");
            }

        } catch (IOException e) {
            System.err.println("An error occurred while comparing files: " + e.getMessage());
        }
    }
}
