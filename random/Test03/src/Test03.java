import java.util.ArrayList;

//集合工具类。
//
//        * 定义findIndex方法，在某集合中，查找某元素，返回第一次出现的索引。
//        * 定义replace方法，将某集合中的某元素，全部替换为新元素。
public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        ArrayList<Integer> arr3= new ArrayList<>();
        addArrList(arr1,15);
        addArrList(arr2,10);
        addArrList(arr3,20);
        System.out.println(findIndex(arr1,5));
        System.out.println(arr1.toString());
        System.out.println(arr2.toString());
        System.out.println(arr3.toString());
        replate(arr3,1,99);
        System.out.println(arr3.toString());
    }
    public static int findIndex(ArrayList<Integer> arr,int num){
        int index=0;
        for (int i = 0; i < arr.size();i++){
            if (num ==arr.get(i)){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void replate(ArrayList<Integer> arr, int num,int new_num){
        for (int i = 0; i < arr.size(); i++){
            if(num==arr.get(i)){
                arr.set(i,new_num);
            }
        }
    }
    public static void addArrList(ArrayList<Integer> arr,int num){
        for (int i = 0;i< num; i++){
            arr.add(i);
        }
    }
}
