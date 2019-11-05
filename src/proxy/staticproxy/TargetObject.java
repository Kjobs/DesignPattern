package proxy.staticproxy;

/**
 * 目标对象--静态代理
 */
public class TargetObject implements BaseInterfaceStatic {

    @Override
    public void func() {
        System.out.println("目标对象实现的接口方法......");
    }
}
