package article_three;

import java.io.Serializable;

/**
 * 传统单例实现方式
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/22 08:51
 */
public class Elvis implements Serializable {

    /**
     * 传统单例实现方式一：公有静态final字段
     * 优点：简单直接，代码可读性高，通过Elvis.INSTANCE 明确获取单例
     * 缺点：
     *  1. 如果Elvis类有很多静态方法或静态字段，类加载时比较耗时
     *  2. 反射攻击：可通过反射调用私有构造器创建新实例（需在构造器中添加防御逻辑）
     *  3. 反序列化问题：反序列化会生成新的对象，需额外实现readResolve()方法
     */
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        // 防反射逻辑
        if(INSTANCE != null) {
            throw new IllegalStateException("Singleton already instantiated");
        }
    }

    /**
     * 反序列化时，返回INSTANCE，防止
     * @return
     */
    private Object readResolve() {
        return INSTANCE;
    }

    /**
     * 传统单例实现方式二：公有静态工厂方法
     * 优点：
     *  1.灵活性高，可修改工厂方法逻辑（如按需创建实例）
     *  2.方法引用可作为函数式接口（如Supplier<Elvis>）
     * 缺点：
     *  与公有字段方式存在相同的反射和序列化问题
     *
     * @return
     */
    public static Elvis getInstance() {
        return INSTANCE;
    }
}
