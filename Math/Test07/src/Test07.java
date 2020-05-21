import java.util.Scanner;

//判断回文字符串。
// 如果一个字符串，从前向后读和从后向前读，
// 都是一个字符串，称为回文串，比如mom，dad，noon
public class Test07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要判断的数字：");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("数字"+num+"是回文数");
        }else {
            System.out.println("数字"+num+"不是回文数");
        }
    }
    public static boolean isPalindrome(Integer num){
        char str []=num.toString().toCharArray();
        int start=0;
        int end=str.length;
        for (int i = 0; i <end ; i++) {
            if (str[start]!=str[end-1]) {
                end--;
                return false;
            }
        }
        return true;
    }
}
