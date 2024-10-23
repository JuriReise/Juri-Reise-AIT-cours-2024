package Classwork_15;


public class Lesson_String {
    public static void main(String[] args) {
        String str1 = "Hallo,";
        char[] chars = { 32, 'W', 'o', 'r', 'l', 'o', 'd', '!' }; // 32 - это код пробела по ASCII
        String str2 = new String(chars); // str2 - это объект класса String, деланный конструктором (тоже метод)
        // new - это обращение к конструктору класса
        System.out.println(str1);
        System.out.println(str2);

        // concantinans (concat) - объединяем, складываем объекты String
        String str = str1 + str2;
        System.out.println(str);

        // str1.concat(str2);
        System.out.println(str1.concat(str1)); // обединили КОНКАНТИНИРОВАЛИ с помощью метода
        System.out.println(str1); //str1  не изменилась так как тип String immutable (не меняется)

        // lenfgh of String (длинна СТРИНГА)
        int l = str.length(); // определяем длину строки STR
        System.out.println(l);

        // firs symbol
        char ch = str.charAt(0);
        System.out.println("First symbol ; " +ch);

        ch = str.charAt(str.length()-1);
        System.out.println("Last symbol ; " +ch);

        // print with spaces
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");


        }
        System.out.println();

        // check equals
        String str3 = " worLD";
        boolean checker = str3.equals(str2); // напоминалка. STR2 выглядит "World"
        System.out.println(checker); // Fals
        checker = str3.equalsIgnoreCase(str2);
        System.out.println(checker); //True

        System.out.println("________________Делаем эксперименты___________________________");
        // sumbol in position
        System.out.println(str);
        int index = str.indexOf('W');
        System.out.println(index); // 7
        int index1 = str.lastIndexOf('d'); // при поиске идём справа на лево ??? - НЕТ
        System.out.println(index1);
        index= str.indexOf('o');
        index1= str.lastIndexOf('o'); //
        System.out.println(index + ", " + index1); //
        index = str.indexOf('x');
        System.out.println(index);

        System.out.println("___________________________substring_____________________________");
        System.out.println(str.substring(7));
        System.out.println(str.substring(7, 10));


        System.out.println("_________________________replace_____________________________");
        System.out.println(str.replace("o", "0-0-0"));


        System.out.println("________________________split______________________________");
        // number of words
        String str4 = "I love, string in Java.";
        String[] words = str4.split(" ");
        int w = words.length;
        System.out.println("Numbers of words in sentence: " + w);

        // numbers of letters
        String[] letters = str4.split("");
        int let = letters.length;
        System.out.println("NUmbers of letters in sentece: " + let);

        System.out.println("________________________String.format______________________________");
        // Вставьте в строку дату полета Гагарина в виде:
        //"Дата полета Гагарина в космос: число – месяц – год." и напечатайте ее в консоли.
        //Используйте String.format()
        int day = 12;
        String month = "April";
        int year = 1961;

        String gagarinDay = String.format("Дата полета Гагарина в космос: %d - %s - %d", day, month, year);
        System.out.println(gagarinDay);






    } // end of main


} // end of class
