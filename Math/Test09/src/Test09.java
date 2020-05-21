import java.util.Scanner;

//校验密码是否合法。
//
//        -  必须至少8个字符。
//        -  必须至少2个大写字符。
//        -  必须只有字母和数字
public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码：");
        String psw =sc.next();
        if (isTrue(psw)){
            System.out.println("密码格式正确");
        }else {
            System.out.println("密码格式错误");
        }
    }
    public static boolean isTrue(String psw){
        char [] ch = psw.toCharArray();
        int count = 0;
        if (psw.length()<8){
            return false;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch [i]>='A'&& ch [i]<='Z'){
                count++;
            }
            if ((ch[i]<'0'||ch[i]>'9')
                    &&(ch[i]<'a'||ch[i]>'z')
                    &&(ch[i]<'A'||ch[i]>'Z')){
                return false;
            }



        }

        if (count<2){
            return false;
        }
        return true;

    }
}
