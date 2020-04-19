package come.carry.personalstudy.twenty.april.day19.code;

import come.carry.personalstudy.twenty.april.day19.util.OrderStatusEnum;

/**
 * Created by Carry
 * Date :2020/4/19
 */
//在某些时候，使用枚举也可以优化 if-else 逻辑分支，按个人理解，它也可以看作一种表驱动方法。
public class three {
    public static void main(String[] args) {
      /*  String OrderStatusDes;
        int OrderStatus = 3;
        if (OrderStatus == 0) {
            OrderStatusDes = "订单未支付";
        } else if (OrderStatus == 1) {
            OrderStatusDes = "订单已支付";
        } else if (OrderStatus == 2) {
            OrderStatusDes = "已发货";
        } else {
            OrderStatusDes = "网络问题";
            System.out.println(OrderStatusDes);
        }
    */
      int OrderStatus=2;
      /*  OrderStatusEnum orderStatusEnum = OrderStatusEnum.Of(OrderStatus);
        System.out.println(orderStatusEnum);
        System.out.println(orderStatusEnum.getDesc());
        System.out.println(orderStatusEnum.getStatus());*/
        String desc = OrderStatusEnum.Of(OrderStatus).getDesc();
        System.out.println(desc);

    }
}
