package proxy.dynamic_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyHandler implements InvocationHandler {
    // 被代理的对象
    public Object target;

    public MyHandler() {
    }

    public MyHandler(Object target) {
        this.target = target;
    }

    // 获取动态生成的代理对象
    public Object getProxyInstance() {
        // 动态生成代理对象（中介）
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 业务增强
     *
     * @param proxy  代理对象（中介）
     * @param method 被代理对象的方法
     * @param args   被代理对象的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("StaticProxy pre extend");
        method.invoke(target, args);
        System.out.println("StaticProxy after extend");
        return null;
    }
}
