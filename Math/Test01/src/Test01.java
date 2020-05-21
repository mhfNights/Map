import java.util.Scanner;

//反转键盘录入的字符串
//        使用字符数组保存原始字符，利用Random类生成随机索引
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString="";
        System.out.println("请输入需要反转的字符串");
        originalString=sc.next();
        System.out.println("你输入的是：");
        System.out.println(originalString);
        originalString=reverseString(originalString);
        System.out.println("反转完成：");
        System.out.println(originalString);
    }
//    对输入的字符串进行并返回
    public static String reverseString(String s){
        String result="";
        char s1[]=s.toCharArray();
        for (int i = s1.length-1; i >=0 ; i--) {
            result +=s1 [i];
        }
        return result;
    }
}
