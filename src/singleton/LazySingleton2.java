package singleton;

/**
 * 单例模式--懒汉式（线程安全）
 *
 * @author kobs
 * @date 2019/11/21
 */
public class LazySingleton2 {

    private static LazySingleton2 instance;

    private LazySingleton2() {
    }

    /**
     * 懒汉式单例模式，加入synchronized解决线程同步问题，但在方法级别上加synchronized的同步会导致效率变低
     */
    public static synchronized LazySingleton2 getInstance() {
        if (instance == null) {
            instance = new LazySingleton2();
        }
        return instance;
    }
}
