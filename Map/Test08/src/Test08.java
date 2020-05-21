import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
//        例如：集合中有”abc”、”bcd”两个元素，
//        程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”
public class Test08 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character,Integer> map = new HashMap<>();
        String s = list.get(0) + list.get(1);
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            Integer num = map.get(aChar);
            if (!map.containsKey(aChar)){
                map.put(aChar,1);
            }else {
                map.put(aChar,num+1);
            }
        }
        System.out.println(map);
    }
}

