package spring.factorybeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.factorybeans.beans.UserMapper;

public class Run {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        userMapper.query();
    }
}
