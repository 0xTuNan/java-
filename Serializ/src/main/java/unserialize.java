import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class unserialize {
         public static void main(String[] args) throws IOException, ClassNotFoundException {

             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("1.txt"));

             Person person = (Person)ois.readObject();
             System.out.println(person.name);
             int age = person.getAge();
             System.out.println(age);

         }
}

