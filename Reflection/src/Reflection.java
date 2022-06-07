import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取类
        Class cl1 = Class.forName("java.lang.Runtime");

        //获取构造方法，非public，使用setAccessible()
        Constructor co1 = cl1.getDeclaredConstructor();
        co1.setAccessible(true);

        //创建runtime类，类似new
        Object runtimeInstance = co1.newInstance();
        //获取exec方法
        Method runtimeMethod = cl1.getMethod("exec", String.class);
        String cmd = "whoami";
        //invoke执行exec方法
        Process process = (Process) runtimeMethod.invoke(runtimeInstance, cmd);
        InputStream in = process.getInputStream();
        System.out.println(in.toString());
    }
}
