import java.util.LinkedHashSet;
import java.util.Scanner;

//十一、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，
//        必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Character> set = new LinkedHashSet();
        String s = sc.next();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            set.add(c);
        }
        for (Character c : set) {
            System.out.print(c);
        }
    }
}
