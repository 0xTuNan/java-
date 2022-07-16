import java.io.*;


public class serializ {
    public static void main(String[] args) throws IOException {
        Person xiaoming = new Person(18, "xiaoming");
        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("1.txt"));

        oss.writeObject(xiaoming);
    }
}



