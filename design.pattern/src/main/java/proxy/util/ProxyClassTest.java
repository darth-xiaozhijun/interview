package proxy.util;

import proxy.IMapper;
import proxy.UserMapper;
import proxy.dynamic_jdk.MyHandler;

public class ProxyClassTest {
    public static void main(String[] args) {
        IMapper mapper1 = new UserMapper();
        MyHandler myHandler = new MyHandler(mapper1);
        ProxyClass.createClassFile("$Proxy0", mapper1.getClass());
    }
}
