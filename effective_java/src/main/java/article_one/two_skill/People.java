package article_one.two_skill;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/17 15:16
 */
public class People {


    // 对于频繁创建且代价高的对象使用缓存。
    private static final Map<String, People> peopleMap = new HashMap<>();

    private final String name;

    private int age;

    public People(String name) {
        this.name = name;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static People createByNameAge(String name, int age) {
        return new People(name, age);
    }

    /**
     * 缓存优化
     * @param name
     * @return
     */
    public static People fromName(String name) {
        return peopleMap.computeIfAbsent(name, People::new);
    }
}
