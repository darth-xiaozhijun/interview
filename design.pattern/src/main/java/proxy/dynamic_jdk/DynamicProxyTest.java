package proxy.dynamic_jdk;

import proxy.IMapper;
import proxy.UserMapper;

public class DynamicProxyTest {
    public static void main(String[] args) {
        IMapper mapper1 = new UserMapper();
        MyHandler myHandler = new MyHandler(mapper1);
        IMapper proxyInstance = (IMapper) myHandler.getProxyInstance();
        proxyInstance.jdbcOperation();
    }
}
