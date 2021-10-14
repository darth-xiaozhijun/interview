package proxy.dynamic_cglib;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CglibProxyTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        CglibProxy cglibProxy = new CglibProxy();
        UserDao proxy = (UserDao) cglibProxy.createProxy(userDao);
        proxy.save();
    }
}
