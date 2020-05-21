import java.util.ArrayList;

//六、定义一个方法listTest(ArrayList<String> al),
//        要求使用isEmpty()判断al里面是否有元素。
public class Test06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        if (listTest(list)){
            System.out.println("list里面没有元素");
        }else {
            System.out.println("list里面有元素");
        }
        list.clear();
        if (listTest(list)){
            System.out.println("list里面没有元素");
        }else {
            System.out.println("list里面有元素");
        }
    }

    public static boolean listTest(ArrayList<Integer> list) {
        if (list.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}

