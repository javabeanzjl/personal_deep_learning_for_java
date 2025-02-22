package article_three;

/**
 * 最佳实践：枚举单例
 * 调用方式ElvisBetter.INSTANCE.leaveTheBuilding();
 * 核心优势：
 *  1. 天然防反射：JMV保证枚举实例的唯一性，反射无法调用枚举的构造器
 *  2. 自动处理序列化：枚举反序列化时直接返回已有实例，无需readResolve()方法
 *  3. 线程安全：枚举实例在类加载时初始化，由JVM保证原子性。
 *  4. 类型是线程安全的，无需显式加锁
 * 局限性：
 *  1. 枚举类型是编译期常量，无法通过接口实现扩展
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/22 08:58
 */
public enum ElvisBetter {
    INSTANCE;// 唯一实例
    public void leaveTheBuilding() {}
}
