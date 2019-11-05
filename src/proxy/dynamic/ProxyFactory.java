package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂--JDK动态代理
 */
public class ProxyFactory {

    /**
     * 目标对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成一个代理对象
     * 1. ClassLoader loader 指定当前类加载器
     * 2. Class<?>[] interfaces 目标对象实现的接口类型，使用泛型方法确认类型
     * 3. InvocationHandler h 事件处理，执行目标对象的方法时，会将其作为参数，触发事件处理器方法
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始~~");
                        // 反射机制调用目标对象
                        Object val =  method.invoke(target, args);
                        System.out.println("JDK代理提交~~");
                        return val;
                    }
                });
    }
}
