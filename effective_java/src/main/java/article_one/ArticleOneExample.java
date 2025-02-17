package article_one;

import article_one.two_skill.People;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

/**
 * 考虑用静态工厂方法代替构造器
 * 静态工厂方法的核心价值在于 控制对象创建过程，通过合理设计可以实现：
 *  1.代码可读性提升（通过命名）
 *  2.性能优化（通过缓存）
 *  3.架构灵活性（通过接口隐藏实现）
 * 在设计类时，应优先考虑是否适合提供静态工厂方法，而不是直接暴露构造器。
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/17 11:06
 */
public class ArticleOneExample {



    /**
     * 缺点1，类不能被继承
     * 缺点2，不易被发现
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * 优点1：有意义的名称
     */
    public static void oneAdvantage() {
        // 举例1
        // 构造器的名称必须与类名一致
        People people = new People("张三", 20);
        // 静态工厂方法的名称可以更具描述性
        People staticPepple = People.createByNameAge("张三", 20);
        // 举例2
        new BigInteger(5, 100, new Random());
        BigInteger.probablePrime(5, new Random());
    }

    /**
     * 优点2：不必在每次调用它们的时候都创建一个新对象
     */
    public static void twoAdvantage() {
        // 可以缓存实例，避免重复创建（如不可变类，享元模式）
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(true);
    }

    /**
     * 优点3：可以返回原返回类型的任何子类型的对象
     * 隐藏实现细节，返回接口或抽象类的子类实例
     */
    public static void threeAdvantage() {

        // 举例1-Collections 框架的工厂方法返回隐藏实现类
        List<String> stringList = Collections.unmodifiableList(new ArrayList<>());
        // 实际返回的是 Collections.UnmodifiableList 实例

    }

    /**
     * 优点4：灵活控制实例化
     * 根据参数动态决定返回对象类型（如服务提供者框架）
     */
    public static void fourAdvantage() throws SQLException {
        // JDBC de DriverManager.getConnection() 方法
        // 根据 URL 参数返回不同数据库的 Connection 实现
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
    }

    /**
     * 优点5：简化泛型实例化
     * 在泛型类型推导复杂的场景中更简洁。
     */
    public static void fiveAdvantage() {
        // 构造器需要重复泛型参数
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

        // 静态工厂方法通过类型推导简化（Java 7+）

    }


}