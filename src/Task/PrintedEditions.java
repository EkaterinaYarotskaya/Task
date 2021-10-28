package Task;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintedEditions implements Serializable {
    private int count = 0;
    ArrayList<PrintedEdition> printedEditions;

    public PrintedEditions(ArrayList<PrintedEdition> printedEditions) {
        this.printedEditions = printedEditions;
    }

    public PrintedEditions() {
        this.printedEditions = printedEditions;
    }


    public void add() {
        System.out.println("Добавте книгу, журнал или газету: ");
        while (count >= 0) {
            PrintedEdition printedEdition = new PrintedEdition();
            printedEdition .setTap();
            printedEdition .setName();
            printedEdition .setDate();
            printedEdition .setAuthor();
            printedEdition .setEdition();
            printedEdition .setTopic();
            printedEditions.add(count,  printedEdition );
            System.out.println(printedEditions.get(0));
            count++;
            System.out.println();

        }
    }

    public void Show_Inf() {
        System.out.println();
        for (int i = 0; i < printedEditions.size(); i++) {
            printedEditions.get(i).show();
        }
    }

    public void Remove_Edition(int i) {
        printedEditions.get(i).show();
        printedEditions.remove(i);
        count = count - 1;
        System.out.println("Удален");
    }

    public void Save_library() throws IOException {
        PrintedEditions printedEditions = new PrintedEditions();
        Serialization  save=new Serialization();
        save.Save(printedEditions);

    }

    public static void main(String[] args) throws IOException {
        PrintedEditions printedEditions = new PrintedEditions();
        int e = 1;
        while (e != 0) {
            System.out.println("Выберите комманду");
            System.out.println("1 - Добавить печатное издание\n2 - Вывести всю информацию\n3 - Удалить печатное издание\n4 - Сохранить и выйти\n");
            System.out.print("Введенная команда: ");
            Scanner in = new Scanner(System.in);
            char y;
            y = in.next().charAt(0);
            switch (y) {
                case '1':
                    printedEditions.add(); //users.Add();
                    continue;

                case '2':
                    printedEditions.Show_Inf();
                    break;

                case '3':
                    System.out.println();
                    System.out.print("Введите ID пользователя: ");
                    int i = in.nextInt();
                    printedEditions.Remove_Edition(i);
                    break;

                case '4':
                    System.out.print("Сохранение данных ");
                    printedEditions.Show_Inf();
                    System.exit(0);
                    break;
            }
        }


    }
}

