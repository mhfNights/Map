import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//键盘录入QQ号码，验证格式的正确性。
//
//        * 必须是5—12位数字。
//        * 0不能开头
public class Test02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String qq="";
        int lqq=0;
        System.out.println("请输入qq号码");
        qq=sc.next();
        if(isCorrect(qq)){
            System.out.println("输入正确");
            char [] num =qq.toCharArray();
            for (int i = 0; i <num.length ; i++) {
                lqq=num[i];
            }
            System.out.println("你输入的qq号码为："+qq
                    );
        }else {
            System.out.println("你输入的qq号码错误，请重新输入");
        }
    }
    public static boolean isCorrect(String qq){
        if (qq.charAt(0) == 0){
            System.out.println("请输入正确的QQ号");
            return false;
        }
            if (qq.length() < 5 ||qq.length() > 12) {
                return false;
            }
            for (int i = 0; i <qq.length() ; i++) {
                char c = qq.charAt(i);
                if (c<'0'||c>'9'){
                    return false;
                }
            }

        return true;
    }
}
