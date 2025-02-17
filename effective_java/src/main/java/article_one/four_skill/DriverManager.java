package article_one.four_skill;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

/**
 * 服务注册API-伪代码
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/17 18:17
 */
public class DriverManager {

    // 对于频繁创建且代价高的对象使用缓存
    private static final Map<String, DatabaseDriver> drivers = new HashMap<>();

    public static void registerDriver(String name, DatabaseDriver driver) {
        drivers.put(name, driver);
    }

    public static Connection getConnection(String url) {
        return drivers.get(url).connect();
    }

}
