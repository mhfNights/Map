//分别使用String的+=和StringBuilder的append方法对字符串做100000次拼接，
// 计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。
public class Test09 {
    public static void main(String[] args) {
        long start ;
        long end;
        String str = "Java";
        start=System.currentTimeMillis();
        stringTime(str);
        end = System.currentTimeMillis();
        System.out.println("String+=拼接字符串10000次所需时间为："
                +(end-start)+"豪微秒");
        start=System.currentTimeMillis();
        stringBuilderTime(str);
        end = System.currentTimeMillis();
        System.out.println("StringBuilder拼接字符串10000次所需时间为："
                +(end-start)+"豪微秒");


    }

    public static void stringTime(String str){
        for (int i = 0; i <10000 ; i++) {
            str += i;
        }
    }

    public static void stringBuilderTime(String str){
        StringBuilder s = new StringBuilder(str);
        for (int i = 0; i <10000 ; i++) {
            s.append(i);
        }
    }
}
