import java.io.*;

public class Person implements Serializable {
    public String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Person(int age,String name){
        this.name = name;
        this.age = age;
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException, InterruptedException {
        //先调用默认的readObject()方法
        in.defaultReadObject();

        //重写，执行系统命令calc.exe
        Runtime.getRuntime().exec("calc");

    }
}
