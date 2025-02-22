package article_three;

/**
 * 第3条：用私有构造器或枚举类型强化Singleton属性
 * 推荐优先级：
 *  1. 枚举单例（首选）：适用于无需继承的场景
 *  2. 公有静态工厂方法 + 防御反射/序列化：适用于需要继承的场景
 * 应用场景：
 *  1. 工具类方法封装，无需依赖注入，且需要避免实例化（如StringUtils、DateUtils）
 *  2. 跨模块共享的无状态处理器（如加密解密、序列化工具）
 *  3. 第三方库或遗留代码适配（集成不依赖Spring容器的第三方库时，如某些SDK的客户端类）
 *  1.全局配置管理（如数据库连接池、日志记录器）。
 *  2.资源密集型对象（如线程池、缓存）
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/22 08:49
 */
public class ArticleThreeExample {

    public static void main(String[] args) {
        StringUtils.INSTANCE.isEmpty("str");
    }
}
