import java.util.ArrayList;
import java.util.Collections;

//五、定义一个方法listTest(ArrayList<String> al,String s),
//        要求使用contains()方法判断al集合里面是否包含s。
public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s ="s";
        Collections.addAll(list,"a","b","c","d","e","s");
        boolean b = listTest(list, s);
        if (b){
            System.out.println("集合list中包含"+s);
        }else {
            System.out.println("集合list中不包含"+s);
        }

    }

    public static boolean listTest(ArrayList<String> a1,String s){
        if (a1.contains(s)){
            return true;
        }else {
            return false;
        }
    }
}
