package spring.factorybeans.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements FactoryBean {
    public Object getObject() throws Exception {
//        return new RolesMapper();
        return new UserMapper();
    }

    public Class<?> getObjectType() {
        return null;
    }

    public void query() {
        System.out.println("UserMapper query...");
    }
}
