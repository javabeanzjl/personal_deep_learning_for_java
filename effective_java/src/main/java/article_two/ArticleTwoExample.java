package article_two;

/**
 * 遇到多个构造器参数时要考虑使用构建器
 * 1.灵活性与可读性
 * 可选参数按需设置，避免为不同组合编写冗余构造器。
 * 方法名称明确参数含义（如 .b(20) 比构造器参数 20 更易理解）。
 * 2. 线程安全与不可变性
 * 对象在 build() 后一次性构造完成，确保状态一致。
 * 结合 final 字段，可实现不可变类
 * 3. 扩展性
 * 新增参数只需在 Builder 中添加方法，无需修改已有构造器
 *
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/18 08:41
 */
public class ArticleTwoExample {

    /**
     * 传统构建对象方式一：重叠构造器模式
     * 当类有多个可选参数时，需为不同参数组合编写多个构造器，导致代码臃肿且难以维护。
     */
    public static void traditionalOne() {
        // 短时候还好，但如果参数过多，很不方便
        People people = new People("张三", 18);
    }

    /**
     * 传统构建对象方式二：JavaBeans模式
     * 通过无参构造器 + Setter 方法设置参数，但会导致对象在构造过程中处于不一致状态（线程不安全），且无法实现不可变类。
     */
    public static void traditionaltwo() {

        People people = new People();
        people.setName("张三");// 中间状态可能被其他线程访问
        people.setAge(18);
        people.setSex("男");
        people.setAddress("北京");
        people.setPhone("123456789");
        people.setJob("程序员");
    }

    /**
     * 使用构建器
     */
    public static void useBuilder() {

        People people = People.builder()
                .name("张三")
                .age(18)
                .sex("男")
                .address("北京")
                .phone("123456789")
                .job("程序员")
                .build();

    }
}
