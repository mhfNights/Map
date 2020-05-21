import java.util.Scanner;

//字符串查找。
//
//        * 键盘录入一个大字符串，再录入一个小字符串。
//        * 统计小字符串在大字符串中出现的次数
public class Test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        woaiheima,heimabutongyubaima,
//        wulunheimahaishibaima,zhaodaogongzuojiushihaoma
        System.out.println("请输入大字符串：");
        String big=sc.nextLine();
        System.out.println("请输入小字符串：");
        String small=sc.nextLine();
        System.out.println("小字符串在大字符串中出现了"+
                getCount(big,small)+"次");
    }
    public static int getCount(String big,String small){
        int index=0;
        int count=0;
        while ((index=big.indexOf(small,index))!=-1){
            index++;
            count++;
        }
        return count;
    }
}
