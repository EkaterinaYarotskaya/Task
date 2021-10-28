package Task;

import java.io.*;

public class Serialization {
    public void Save(PrintedEditions printedEditions) throws IOException {
        try {
            //Записываем в файл объект Users(спускаем фигуру и запихиваем в коробку)
            printedEditions = new PrintedEditions();
            FileOutputStream fos = new FileOutputStream("inf");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.close();//oos - это внешний поток.Если мы закрываем внешний то ивнутренний тоже.

            //Читаем с файла объект Users(достаем фигуру с коробки и надуваем)
            FileInputStream fis = new FileInputStream("Iform.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();//Получаем объекты в том порядке,в котором
            //записывали(Спустили фигуру собачки и положили в коробку первую,значит
            //и достаем тогда её первой и надуваем
            //Так как Object нужно привести к типу ниже в иерархии

            ois.close();
        }
    catch(IOException ex){
                ex.printStackTrace();
            }catch(ClassNotFoundException ex){
                //Данное исключение может появиться,если класс объекта,
                //которые мы хотим надуть не найден.
                ex.printStackTrace();
            }

//            File file = new File("printedEditions.dat");
//        ObjectOutputStream oos = null;
//        FileOutputStream fos = new FileOutputStream(file);
//        oos = new ObjectOutputStream(fos);
//        oos.writeObject(printedEditions);
//        oos.close();
    }
}
