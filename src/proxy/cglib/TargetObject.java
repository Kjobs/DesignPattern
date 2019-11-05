package proxy.cglib;

/**
 * 目标对象--cglib动态代理
 */
public class TargetObject {

    public void func() {
        System.out.println("目标对象的方法，不需要实现接口");
    }
}
