package singleton;

/**
 * 单例模式--枚举实现
 *
 * @author kobs
 * @date 2019/11/21
 */
public enum LazySingleton5 {
    /**
     * 属性
     */
    INSTANCE;

    /**
     * 方法
     */
    public void method(){
        System.out.println("单例模式-枚举实现：不仅可以解决多线程的问题，还能防止在反序列化重新创建新的对象");
    }
}
