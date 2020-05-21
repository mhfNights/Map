//十二、编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
public class Test12 {
    public static void main(String[] args) {
        String [] str ={"H","e","l","l","o","j","a","v","a"};
        reverse(str);
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
    private static <E> void reverse(E str[]){
        int end =str.length-1;
        for (int start = 0; start < end; start++,end--) {
            E e;
            e = str [start];
            str [start] = str [end];
            str [end] = e;
        }
    }
}
