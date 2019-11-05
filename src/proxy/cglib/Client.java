package proxy.cglib;

public class Client {
    public static void main(String[] args) {

        TargetObject target = new TargetObject();

        TargetObject proxyInstance = (TargetObject) new ProxyFactory(target).getProxyInstance();

        proxyInstance.func();
    }
}
