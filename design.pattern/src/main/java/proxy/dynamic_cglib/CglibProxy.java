package proxy.dynamic_cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    // 被代理对象
    private Object target;

    public Object createProxy(Object target) {
        this.target = target;
        // 用来生产代理的工厂
        Enhancer enhancer = new Enhancer();
        // 设置被代理的类对象
        enhancer.setSuperclass(target.getClass());
        // 设置回调方法，回调的是当前类的对象的intercept方法
        enhancer.setCallback(this);
        // 创建代理对象，中介
        Object proxy = enhancer.create();
        return proxy;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 前置增强
        System.out.println("前置增强");
        // 调用被代理对象的被增强方法
        method.invoke(target, objects);
//        methodProxy.invokeSuper(o,objects);
        System.out.println("后置增强");
        return null;
    }
}
