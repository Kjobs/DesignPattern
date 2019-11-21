package singleton;

/**
 * 单例模式--懒汉式（静态内部类）
 *
 * @author kobs
 * @date 2019/11/21
 */
public class LazySingleton4 {

    private LazySingleton4(){}

    /**
     * 静态内部类
     * 1. 内部类是延时加载的，只有在使用时才会加载
     * 2. 类的静态属性只会在第一次加载时初始化，在这里JVM保证了线程安全性
     */
    private static class SingletonInstance{
        private static final LazySingleton4 INSTANCE = new LazySingleton4();
    }

    public static LazySingleton4 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
