import java.util.ArrayList;

//筛选字符串。
//
//        * 定义ArrayList集合，存入多个字符串。
//        * 长度大于5的字符串，打印删除后的集合
public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        addList(list);
        System.out.println(list);
        delFiveStr(list);
        System.out.println(list);
    }
    public static void addList(ArrayList<String> list){
        list.add("zisdhajfbsdjk,");
        list.add("java");
        list.add("HelloWorld");
        list.add("dka");
        list.add("dajskdk");
    }
    public static void delFiveStr (ArrayList<String> list){
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).toString().length()>5){
                list.remove(i);
            }
        }
    }
}
