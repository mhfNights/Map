import java.util.ArrayList;
import java.util.Collections;

//九、ArrayList集合中有如下内容： {33,11,77,55}，
// 使用Collections.sort()对ArrayList集合中的数据进行排序，
// 并打印出排序后的结果
public class Test09 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Collections.addAll(num,33,11,77,55);
        System.out.println("排序前");
        System.out.println(num);
        Collections.sort(num);
        System.out.println("排序后");
        System.out.println(num);
    }
}
