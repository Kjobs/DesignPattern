package proxy.dynamic;

/**
 * 目标对象--JDK动态代理
 */
public class TargetObject implements BaseInterfaceDynamic {

    @Override
    public void func() {
        System.out.println("目标对象实现的接口方法......");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
