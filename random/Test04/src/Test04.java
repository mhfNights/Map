import java.util.ArrayList;
import java.util.Random;

//统计数字出现次数。
//
//        * 定义getNumList方法，随机生成100个数字，数字范围从1到10。
//        * 定义printCount方法，统计每个数字出现的次数并打印到控制台。
public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> arr =getNumList();
        printCount(arr);
        System.out.println(arr.toString());
    }
    public static ArrayList<Integer> getNumList(){
        Random r = new Random();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            num.add(r.nextInt(10)+1);
        }
        return num;
    }
    public static void printCount(ArrayList<Integer> arr){
        int [] count =new int[10] ;
        for (int i = 0; i <arr.size() ; i++) {
            int c =arr.get(i);
            count[c-1]++;
        }
        for (int i = 0; i <count.length ; i++) {
            System.out.println("数字"+(i+1)+"出现了"+count[i]+"次");
        }
    }
}
