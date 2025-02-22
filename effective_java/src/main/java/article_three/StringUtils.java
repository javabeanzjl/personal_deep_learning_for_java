package article_three;

/**
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/22 09:09
 */
public enum StringUtils {
    INSTANCE;

    public boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
