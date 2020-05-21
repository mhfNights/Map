import java.util.*;

//十二、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
//        红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。
//        （要求同色号码不重复）
public class Test12 {
    public static void main(String[] args) {
        Random r = new Random();
        LinkedHashSet<Integer> num = new LinkedHashSet<>();
        while (num.size()<6){
            num.add(r.nextInt(33)+1);
        }
        while (num.size()<7) {
            num.add(r.nextInt(16) + 1);
        }
        System.out.println(num);
    }
}
