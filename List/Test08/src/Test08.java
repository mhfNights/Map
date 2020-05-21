import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

//八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。
//        使用迭代器和增强for循环遍历LinkedHashSet
public class Test08 {
    public static void main(String[] args) {
        LinkedHashSet<String> name = new LinkedHashSet<>();
        Collections.addAll(name,"王昭君","王昭君",
                "西施","杨玉环","貂蝉");
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------");
        for (String s : name) {
            System.out.println(s);
        }
    }
}
