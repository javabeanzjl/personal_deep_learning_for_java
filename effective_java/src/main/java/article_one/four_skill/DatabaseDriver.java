package article_one.four_skill;

import java.sql.Connection;

/**
 * 服务接口
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/17 18:16
 */
public interface DatabaseDriver {

    Connection connect();
}
