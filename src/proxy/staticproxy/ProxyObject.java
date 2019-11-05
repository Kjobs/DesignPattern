package proxy.staticproxy;

/**
 * 代理对象--静态代理
 */
public class ProxyObject implements BaseInterfaceStatic {

    /**
     * 目标对象，通过接口来聚合
     */
    private BaseInterfaceStatic baseInterface;

    public ProxyObject(BaseInterfaceStatic baseInterface) {
        this.baseInterface = baseInterface;
    }

    @Override
    public void func() {

        System.out.println("代理开始......");
        baseInterface.func();
        System.out.println("代理结束......");

        System.out.println("代理对象实现接口功能的拓展......");
    }
}
