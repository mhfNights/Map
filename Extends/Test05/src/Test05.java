import java.util.ArrayList;

//编写步骤
//        1. 模拟汽车网站信息。
//        2. 定义汽车Auto类
//        1. 属性：品牌，车长，价格
//        3. 定义SUV继承Auto类
//        1. 属性：小型车车长标准值：4295，中型车车长标准值：5070。
//        2. 定义判断车型方法
//        1. 判断小型车：小于小型车车长标准值
//        2. 判断大型车：大于中型车车长标准值
//        3. 判断中型车：大于小型车车长标准值并且小于等于中型车车长标准值
//        4. 测试类中，创建若干SUV对象，保存到集合，遍历集合，输出中型SUV
public class Test05 {
    public static void main(String[] args) {
        ArrayList<SUV> suv = new ArrayList<>();
        suv.add(new SUV(4562,670000));
        suv.add(new SUV(1562,970000));
        suv.add(new SUV(6562,6170000));
        suv.add(new SUV(9562,6570000));
        suv.add(new SUV(3562,270000));
        suv.add(new SUV(4962,870000));
        for (int i = 0; i < suv.size(); i++) {
            SUV s = suv.get(i);
            String sort = s.JudgmentSize(s.getPrice());
           switch(sort){
               case "大型车":
                   System.out.println("大型SUV："+"价格："+suv.get(i).getPrice());
                   break;
               case "中型车":
                   System.out.println("中型SUV："+"价格："+suv.get(i).getPrice());
                   break;
               case "小型车":
                   System.out.println("小型SUV："+"价格："+suv.get(i).getPrice());
                   break;
               case "null":
                   System.out.println("此车无货");

           }
        }
    }
}
