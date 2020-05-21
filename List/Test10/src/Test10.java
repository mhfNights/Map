//十、已知数组存放一批QQ号码，QQ号码最长为11位，
//        最短为5位String[] strs = {"12345","67891","12347809933",
//        "98765432102","67891","12347809933"}。
//        将该数组里面的所有qq号都存放在LinkedList中，
//        将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Test10 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933",
                "98765432102","67891","12347809933"};
        LinkedList<String> qq = new LinkedList();
        for (String str : strs) {
            if (!qq.contains(str)){
                qq.add(str);
            }
        }
        Iterator<String> iterator = qq.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------");
        for (String s : qq) {
            System.out.println(s);
        }
    }
}
