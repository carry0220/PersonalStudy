package come.carry.personalstudy.twenty.april.day19.code;

/**
 * Created by Carry
 * Date :2020/4/19
 */
//根据情况使用三元运算法 以简化某些 if-else，使代码更加简洁，更具有可读性。
 /*   int  price ;
            if(condition){
            price = 80;
            }else{
            price = 100;
            }*/
public class two {
    public static void main(String[] args) {
        int price = 105;
        price = price > 100 ? 80 : 100;
        System.out.println(price);
    }
}
