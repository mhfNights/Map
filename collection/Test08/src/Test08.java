import java.util.ArrayList;
import java.util.Collections;

//八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，
//        要求返回s在al里面第一次出现的索引，如果s没出现过返回-1
public class Test08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,4,5,6,7,3,8,9,0);
        int s = 11;
        int i = listTest(list, s);
        System.out.println(i);

    }

    private static int listTest(ArrayList<Integer> list, int s) {
        int index =0;
        for (Integer i : list) {
            index++;
           if (i == s){
               return index-1;
           }
        }
        return -1;
    }
}
