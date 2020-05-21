//定义getValue方法，获取三个数中的最值，能够通过字符串，指定获取最大值或者最小值。
public class Test04 {
    public static void main(String[] args) {
        getValue("最大值",1,2,3);
        getValue("最小值",7,10,67);
        getValue("123",34,78,56);
    }
    public static void getValue(String str,int num1,int num2,int num3){
        switch (str){
            case "最大值":
                int max=getMax(num1,num2,num3);
                System.out.println("最大值："+max);
                break;
            case "最小值":
                int min = getMin(num1,num2,num3);
                System.out.println("最小值："+min);
                break;
                default:
               System.out.println("请输入正确指令");
               break;

        }
    }
    public static int getMin(int i, int j, int k){
        int min=i<j?(i<k?i:k):(j<k?j:k);
        return min;
    }
    public static int getMax(int i, int j, int k){
        int max=i>j?(i>k?i:k):(j>k?j:k);
        return max;
    }
}
