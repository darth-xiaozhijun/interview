package proxy.static_;

import proxy.AdminMapper;
import proxy.IMapper;
import proxy.UserMapper;

public class StaticProxyTest {
    public static void main(String[] args) {
        IMapper mapper1 = new UserMapper();
        StaticProxy staticProxy = new StaticProxy();
        staticProxy.jdbcOperation(mapper1);
        IMapper mapper2 = new AdminMapper();
        staticProxy.jdbcOperation(mapper2);
    }
}
