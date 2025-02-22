package article_three;

/**
 * 集成不依赖 Spring 容器的第三方库时（如某些 SDK 的客户端类）。
 * 优势：脱离 Spring 容器独立存在，确保全局唯一性
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/22 09:21
 */
public enum SdkClient {

    INSTANCE;

    private final Client client = new Client();

    public Client getClient() {
        return client;
    }
}
