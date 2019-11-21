package singleton;

/**
 * 单例模式
 *
 * @author kobs
 * @date 2019/11/21
 */
public class MainClass {

    /**
     * 单例模式总结
     * 1. 单例模式保证系统只存在一个对象，节省系统资源
     * 2. 单例模式实例化对象时不能使用new
     * 3. 使用场景是：需要频繁创建销毁的对象，创建对象耗时较多或耗费资源较多
     */
    public static void main(String[] args) {
        LazySingleton5 singleton = LazySingleton5.INSTANCE;
        LazySingleton5 singleton1 = LazySingleton5.INSTANCE;
        System.out.println("hashcode: " + singleton.hashCode());
        System.out.println("hashcode: " + singleton1.hashCode());

        singleton.method();
    }
}
