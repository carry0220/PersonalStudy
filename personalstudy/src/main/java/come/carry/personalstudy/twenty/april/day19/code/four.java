package come.carry.personalstudy.twenty.april.day19.code;

/**
 * Created by Carry
 * Date :2020/4/19
 */
//如果有一系列条件返回一样的结果，可以将它们合并为一个条件表达式，让逻辑更加清晰。
public class four {
    //before
    public static double getVipDiscount1() {
       int age=20;
       Boolean isStudent=true;
       String city=null;
        if(age<18){
            return 0.8;
        }
        if("深圳".equals(city)){
            return 0.8;
        }
        if(isStudent){
            return 0.8;
        }
        //do somethig
   return 0.88;
    }
    //after
   public static double getVipDiscount2(){
       int age=20;
       Boolean isStudent=false;
       String city=null;
        if(age<18|| "深圳".equals(city)||isStudent){
            return 0.8;
        }
        //doSomthing
       return 0.88;
    }
    public static void main(String[] args) {
            System.out.println(getVipDiscount1());
            System.out.println(getVipDiscount2());
    
        }
}
