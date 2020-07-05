
import java.io.*;

public class SerialableDemo {
    private static final String string = "hello";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write();
//        read();

        String b = "hello";
        b = "world";
        String s = new String("world");
        //System.out.println(a == b);
        //System.out.println(c == b);
        //System.out.println(c == s);
        //System.out.println(c.equals(s));
    }

    public static void write() throws IOException {
        Student student = new Student();
        student.setAge(20);
        student.setName("zhangsan");
        FileOutputStream fileOutputStream= new FileOutputStream("D://student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);

    }

    public static void read() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D://student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        System.out.println(object);

    }
}
