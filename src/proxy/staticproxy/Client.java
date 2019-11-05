package proxy.staticproxy;

public class Client {

    public static void main(String[] args) {

        // 创建目标（被代理）对象
        TargetObject target = new TargetObject();

        // 创建代理对象，同时将被代理对象传递给代理对象
        ProxyObject proxy = new ProxyObject(target);

        // 通过代理对象调用目标对象的方法
        proxy.func();

    }
}
