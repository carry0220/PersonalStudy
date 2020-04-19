package come.carry.personalstudy.twenty.april.day19.code;

import java.util.Optional;

/**
 * Created by Carry
 * Date :2020/4/19
 */
//有时候 if-else 比较多，是因为非空判断导致的，这时候你可以使用 java8 的 Optional 进行优化。
public class five {
    public static void main(String[] args) {
        /*String str = "jay@huaxiao";
        if (str != null) {
            System.out.println(str);
        } else {
            System.out.println("Null");
        }*/
        Optional<String> strOptional = Optional.of("jay@huaxiao");
        //strOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Null"));
        }
}
