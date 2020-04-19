package come.carry.personalstudy.twenty.april.day19.util;

/**
 * Created by Carry
 * Date :2020/4/19
 */
public enum OrderStatusEnum {
    UN_PAID(0,"订单未支付"),PAID(1,"订单已支付"),SENDED(2,"订单已发货"),;
    private int status;
    private String desc;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    OrderStatusEnum(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }
   public static OrderStatusEnum Of(int orderStatus){
        for (OrderStatusEnum value : OrderStatusEnum.values()) {
            if (value.getStatus()==orderStatus){
                return value;
            }
        }
        return null;
    }
}
