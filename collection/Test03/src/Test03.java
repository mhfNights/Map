import java.util.ArrayList;

//三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，
// 并返回
public class Test03 {
    public static void main(String[] args) {
        int [] num = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> integers = numList(num);
        System.out.println(integers);
    }

    private static ArrayList<Integer> numList(int[] num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : num) {
            list.add(i);
        }
        return list;
    }

}
