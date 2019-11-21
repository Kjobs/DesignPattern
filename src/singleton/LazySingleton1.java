package singleton;

/**
 * 单例模式--懒汉式（线程不安全）
 *
 * @author kobs
 * @date 2019/11/21
 */
public class LazySingleton1 {

    private static LazySingleton1 instance;

    private LazySingleton1() {
    }

    /**
     * 当使用到该方法时才会去创建instance对象，线程不安全，只能在单线程环境下使用
     */
    public static LazySingleton1 getInstance() {
        if (instance == null) {
            instance = new LazySingleton1();
        }
        return instance;
    }

}
