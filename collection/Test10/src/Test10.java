import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//十、产生10个1-100的随机数，并放到一个数组中，
//        把数组中大于等于10的数字放到一个list集合中，并打印到控制台
public class Test10 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] nums =new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100) + 1;
        }
        for (int num : nums) {
            System.out.print(num+" ");
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]>10){
                list.add(nums[i]);
            }
        }
        System.out.println();
        System.out.println(list);
    }
}
