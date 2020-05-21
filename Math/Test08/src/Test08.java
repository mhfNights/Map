import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int first = sc.nextInt();
        System.out.println("请输入运算符号：");
        String symbol = sc.next();
        System.out.println("请输入第二个数：");
        int second = sc.nextInt();
        int result = operation(first,symbol,second);
        System.out.println(first+symbol+second+"="+result);
    }

    public static int operation(int first, String symbol, int second) {
        switch (symbol) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
            case "%":
                return first % second;
            default:
                System.out.println("请输入正确的运算符：");

        }
        return 0;

    }
}
