package article_two;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 参数非常多的people，通过lombok的@Builder注解开启建造者模式
 * @author 程序员阿乐
 * @description
 * @createDate 2025/2/18 08:42
 */
@Data
@AllArgsConstructor
@Builder
public class People {

    private String name;
    private int age;
    private String sex;
    private String address;
    private String phone;
    private String email;
    private String idCard;
    private String job;


    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
