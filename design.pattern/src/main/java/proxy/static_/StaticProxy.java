package proxy.static_;

import proxy.IMapper;

public class StaticProxy {
    public void jdbcOperation(IMapper mapper) {
        System.out.println("StaticProxy pre extend");
        mapper.jdbcOperation();
        System.out.println("StaticProxy after extend");
    }
}
