import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
//        并使用keySet和entrySet两种方式遍历Map集合
public class Test05 {
    public static void main(String[] args) {
        HashMap<Car,Integer> carMap = new HashMap<>();
        Car c1 = new Car("小车","白色");
        Car c2 = new Car("轿车","白色");
        Car c3 = new Car("面包车","白色");
        Car c4 = new Car("跑车","白色");
        carMap.put(c1,80000);
        carMap.put(c2,100000);
        carMap.put(c3,120000);
        carMap.put(c4,150000);
        System.out.println(carMap);
        Set<Car> cars = carMap.keySet();
        for (Car car : cars) {
            System.out.println(car+"="+carMap.get(car));
        }
        System.out.println("-------------------------------");
        Set<Map.Entry<Car, Integer>> entries = carMap.entrySet();
        for (Map.Entry<Car, Integer> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
