package article_one.three_skill;

/**
 * 返回接口类型，隐藏实现类
 * 隐藏具体实现类，提高灵活性
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/17 18:13
 */
public class PeopleServiceFactory {

    // 返回接口类型，隐藏实现类
    public static PeopleService getInstance() {
        return new PeopleServiceImpl();
    }
}
