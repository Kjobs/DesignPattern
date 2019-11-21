package singleton;

/**
 * 单例模式--饿汉式(静态变量实现)
 *
 * @author kobs
 * @date 2019/11/21
 */
public class EagerStaticSingleton {

    private EagerStaticSingleton() {
    }

    /**
     * 在类装载的时候就完成实例化，避免了线程同步的问题
     */
    private final static EagerStaticSingleton INSTANCE = new EagerStaticSingleton();

    public static EagerStaticSingleton getInstance() {
        return INSTANCE;
    }
}
