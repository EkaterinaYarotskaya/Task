package Task;

import java.io.Serializable;
import java.util.Scanner;

public class PrintedEdition implements Serializable {
    private String tap;
    private String name;
    private String date;
    private  String author;
    private  String edition;
    private String topic;
    Scanner in = new Scanner(System.in);


    public String getTap() {
        return tap;
    }

    public String setTap() {
        System.out.println("Введите тип печатногоиздания: ");
        name=in.nextLine();
        return tap;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        System.out.println("Введите название: ");
        name=in.nextLine();
        return name;
    }

    public String getDate() {
        return date;
    }

    public String setDate() {
        System.out.println("Введите дату выпуска: ");
        date=in.nextLine();
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String setAuthor() {
        System.out.println("Введите автора: ");
        author=in.nextLine();
        return author;
    }

    public String getEdition() {
        return edition;
    }

    public String setEdition() {
        System.out.println("Введите издание: ");
        edition=in.nextLine();
        return edition;
    }

    public String getTopic() {
        return topic;
    }

    public String setTopic() {
        System.out.println("Введите тему: ");
        topic=in.nextLine();
        return topic;
    }
    public  void show(){
        System.out.println("Название: "+name+",дата издания: "+date+", " +
                "автор: "+author+", издание: "+edition+", тема: "+topic);
    }
}

//    public PrintedEdition(String tap, String name, String date, String author, String edition, String topic) {
//        this.tap =tap;
//        this.name = name;
//        this.date = date;
//        this.author = author;
//        this.edition = edition;
//        this.topic = topic;
//    }
