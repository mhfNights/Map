import java.util.Scanner;

//替换某字符串中的某字符串。
//
//        * 键盘录入一个srcStr字符串，再录入一个delStr字符串。
//        * 删除该字srcStr符串中的所有delStr字符串
public class Test04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String srcStr=sc.nextLine();
        System.out.println("请输入要删除的字符串");
        String delStr=sc.nextLine();
        delStr(srcStr,delStr);
    }
    public static void delStr(String srcStr ,String delStr){
        String newStr=srcStr.replace(delStr,"");
        int count=(srcStr.length()-newStr.length())/delStr.length();
        System.out.println("字符串中包含"+count+"个"+delStr+"\r\n删除"
        +delStr+"后的字符串为："+newStr);
    }
}
