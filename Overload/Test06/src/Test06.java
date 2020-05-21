//定义round方法，接收一位小数，实现四舍五入运算，并返回结果
public class Test06 {
    public static void main(String[] args) {
        System.out.println("10.4:"+round(10.4));
        System.out.println("11.7："+round(11.7));
        System.out.println("24.9:"+round(24.9));
        System.out.println("27.1:"+round(27.1));
    }
    public static int round(double d1){
        int num=(int)(d1 + 0.5);
        return num;
    }
}
