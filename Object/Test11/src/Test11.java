import java.util.Random;

//(1)打印由7，8，9三个数组成的三位数，要求该三位数中任意两位数字不能相同；
//        (2)打印格式最后的三位数字以空格分隔，如789 798 879 897 978 987。
//        注：要求使用StringBuilder来完成
//
public class Test11 {
    public static void main(String[] args) {

        Random r = new Random();
        int num = 0;
        for (int i = 0; i <6 ; ) {
            StringBuilder s = new StringBuilder();
            num = r.nextInt(3) + 7;
            s.append(num);
            num = r.nextInt(3) + 7;
            s.append(num);
            num = r.nextInt(3) + 7;
            s.append(num);
            if(s.charAt(0)!=s.charAt(1)
                    &&s.charAt(1)!=s.charAt(2)
                    &&s.charAt(2)!=s.charAt(0)){
                i++;
                System.out.print(s+" ");

            }


        }

    }
}
