import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//四、往一个Map集合中添加若干元素。获取Map中的所有value，
//        并使用增强for和迭代器遍历输出每个value
public class Test04 {
    public static void main(String[] args) {
        HashMap<String,Integer> name = new HashMap<>();
        name.put("张三",18);
        name.put("李四",18);
        name.put("王五",18);
        name.put("赵六",18);
        Set<String> set = name.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------------");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
