package singleton;

/**
 * 单例模式--懒汉式（双重检测机制）
 *
 * @author kobs
 * @date 2019/11/21
 */
public class LazySingleton3 {
    /**
     * 引入volatile保证instance在不同线程之间的可见性
     */
    private static volatile LazySingleton3 instance;

    private LazySingleton3() {
    }

    /**
     * 加入双重检测机制，引入创建对象实例级别上的synchronized同步，解决线程安全问题
     */
    public static LazySingleton3 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton3.class) {
                if (instance == null) {
                    instance = new LazySingleton3();
                }
            }
        }
        return instance;
    }
}
