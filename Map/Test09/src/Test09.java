//九、利用Map，完成下面的功能：
//        从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
//        如果该 年没有举办世界杯，则输出：没有举办世界杯
//十、在原有世界杯Map 的基础上，增加如下功能： 读入一支球队的名字，输出该球队夺冠的年份列表。
//        例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002
//        读入“荷兰”，应当输出 没有获得过世界杯
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test09 {
    public static void main(String[] args) {
        HashMap<Integer,String> worldCup = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        init(worldCup);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();
        if (!worldCup.containsKey(year)){
            System.out.println("没有举办世界杯");
        }else {
            System.out.println("该年的世界杯冠军是:"+worldCup.get(year));
        }
        System.out.println("请输入一个国家名称：");
        String country = sc.next();
        Set<Integer> set = worldCup.keySet();
        int count = 0;
        for (Integer i : set) {
            if (worldCup.get(i).equals(country)){
                System.out.println(i);
            }else {
                count++;
            }
        }
        if (count == worldCup.size()){
            System.out.println("没有获得过世界杯");
        }

    }

    private static void init(HashMap<Integer, String> m) {
        m.put(1930, "乌拉圭");
        m.put(1934, "意大利");
        m.put(1938, "意大利");
        m.put(1950, "乌拉圭");
        m.put(1954, "西德");
        m.put(1958, "巴西");
        m.put(1962, "巴西");
        m.put(1966, "英格兰");
        m.put(1970, "巴西");
        m.put(1974, "西德");
        m.put(1978, "阿根廷");
        m.put(1982, "意大利");
        m.put(1986, "阿根廷");
        m.put(1990, "西德");
        m.put(1994, "巴西");
        m.put(1998, "法国");
        m.put(2002, "巴西");
        m.put(2006, "意大利");
        m.put(2010, "西班牙");
        m.put(2014, "德国");


    }

}
