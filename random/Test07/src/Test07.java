import java.util.ArrayList;

//自定义MyList类，实现存取元素的功能。
//
//        * 定义add方法，可以保存元素，添加MyList尾部。
//        * 定义remove方法，可以获取到最后添加的元素，并从MyList中移除该元素。
//        * 定义show方法，可以展示MyList中的元素
public class Test07 {
    public static void main(String[] args) {
        MyList list=new MyList();
        for (int i = 0; i <15 ; i++) {
            list.add(i+"号元素");
        }
        list.show();
        list.remove();
        list.show();
    }
}
