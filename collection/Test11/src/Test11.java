import javax.lang.model.element.Element;

//十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换
public class Test11 {
    public static void main(String[] args) {
        Integer [] str ={1,2,3,4,5,6,7,8,9};
        exChange(str,3,5);
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
    private static <E>  void exChange(E[] str,int i1,int i2){
        E e;
        e = str[i1];
        str [i1] = str [i2];
        str [i2] = e;

    }

}
