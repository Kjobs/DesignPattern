package singleton;

/**
 * 单例模式--饿汉式(静态代码块实现)
 *
 * @author kobs
 * @date 2019/11/21
 */
public class EagerStaticBlockSingleton {

    private EagerStaticBlockSingleton() {
    }

    private static EagerStaticBlockSingleton instance;

    /**
     * 静态代码块中创建单例对象
     */
    static {
        instance = new EagerStaticBlockSingleton();
    }

    public static EagerStaticBlockSingleton getInstance() {
        return instance;
    }
}
