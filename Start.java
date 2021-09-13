package substrings;

import java.util.Scanner;

class Start {

    static String InputString;
    static Scanner INPUT = new Scanner(System.in);

    public Start() {
        inputNumbers(); //вызываем метод для вода данных    
    }

    /**
     * Метод,отвечающий за ввод данных с командной строки.
     */
    public static void inputNumbers() {

        System.out.print("Enter the line: ");
        InputString = INPUT.nextLine();
        
        //создаем обхект класса SubstringSearch для нахождения подстрок
        SubstringSearch SubS = new SubstringSearch(InputString);
    }
}
