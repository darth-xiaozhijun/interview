package proxy.util;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProxyClass {
    public static void createClassFile(String proxyName, Class clazz) {
        byte[] classFile = ProxyGenerator.generateProxyClass(proxyName, new Class[]{clazz});
        String path = "D:\\idea-workspace\\interview\\design.pattern\\target\\classes\\proxy\\util\\";
        System.out.println("path: " + path);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path + proxyName + ".class");
            fileOutputStream.write(classFile);
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
