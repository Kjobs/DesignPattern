package proxy.dynamic;

public class Client {

    public static void main(String[] args) {
        // 创建目标对象
        BaseInterfaceDynamic target = new TargetObject();

        // 给目标对象创建代理对象
        BaseInterfaceDynamic proxyInstance = (BaseInterfaceDynamic) new ProxyFactory(target).getProxyInstance();

        // 内存中动态生成了代理对象
        System.out.println("proxyInstance对象类型：" + proxyInstance);
        System.out.println("proxyTnstance类类型：" + proxyInstance.getClass());

        // 通过代理对象调用目标对象的方法
        proxyInstance.func();

        proxyInstance.sayHello(" world ");
    }
}
