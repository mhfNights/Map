import java.util.ArrayList;
import java.util.Collections;

//七、向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫
public class Test07 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        Collections.addAll(name,"张三","李四","王五","二丫","钱六",
                "孙七");
        int index;
        for (int i = 0; i < name.size(); i++) {
           if (name.get(i).equals("二丫")){
               name.set(i,"王小丫");
           }
        }
        System.out.println(name);
    }
}
