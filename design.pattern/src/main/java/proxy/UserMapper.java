package proxy;

import proxy.IMapper;

public class UserMapper implements IMapper {
    public void jdbcOperation() {
        System.out.println("UserMapper execute jdbc operation");
    }
}
