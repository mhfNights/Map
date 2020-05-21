import java.util.Random;
import java.util.Scanner;

//生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题
public class Test05 {
    public static void main(String[] args) {
        Random r=new Random();
        Double d1=r.nextDouble()*100;
        String str =d1+"";
        System.out.println(str);
        int index=str.indexOf(".");
        String newStr=str.substring(0,index+3);
        System.out.println(newStr);
    }
}
