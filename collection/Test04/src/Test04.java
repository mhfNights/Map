import java.util.ArrayList;
import java.util.Collections;

//四、定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
//        并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,0,1,2,3,4,5,6,7,8,9);
        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.print(object+" ");
        }
    }


}
