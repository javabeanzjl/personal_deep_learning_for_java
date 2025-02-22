package article_three;

/**
 * 跨模块共享的无状态处理器-序列化工具
 * 避免重复创建 ObjectMapper 实例，同时防止序列化/反射破坏单例
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/22 09:11
 */
public enum JsonSerializer {

    INSTANCE;

    private final ObjectMapper objectMapper = new ObjectMapper();

    private String serialize(Object object) {
        return objectMapper.writeValueAsString(object);
    }
}
