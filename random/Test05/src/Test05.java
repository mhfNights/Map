import java.util.ArrayList;
import java.util.Random;

//模拟统计班级考试分数分布情况，分别统计100-80，79-60，59-40，39-0各个阶段的人数。
//
//        * 定义getScoreList方法，随机生成50个数字，数字范围从0到100。
//        * 定义countScore方法，统计各个阶段的分数个数。
//        * 定义printCount方法，打印各个阶段的统计结果。
public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> scoreList=getScoreList();
        printCount(countScore(scoreList));
        System.out.println(scoreList.toString());
    }
    public static ArrayList<Integer> getScoreList(){
        ArrayList<Integer> num =new ArrayList<>();
        Random r =new Random();
        for (int i = 0; i <50 ; i++) {
            num.add(r.nextInt(100));
        }
        return num;
    }
    public static ArrayList<Integer> countScore(ArrayList<Integer> list){
        ArrayList<Integer> count=new ArrayList<>();
        int count80=0;
        int count60=0;
        int count40=0;
        int count0=0;
        for (int i = 0; i <list.size() ; i++) {
            int score=list.get(i);
            if (score>=0&&score<40){
                count0++;
            }else if (score>=40&&score<60){
                count40++;
            }else if (score>=60&&score<80){
                count60++;
            }else{
                count80++;
            }
        }
        count.add(count0);
        count.add(count40);
        count.add(count60);
        count.add(count80);
        return count;
    }
    public static void printCount(ArrayList<Integer> list){
        int start=0;
        int end=40;
        for (int i = 0; i <list.size(); i++) {
            System.out.println("分数在"+start+"----"+end+"之间的人数为："+list.get(i));
            switch (i){
                case 0:
                    start=40;
                    end=60;
                    break;
                case 1:
                    start=60;
                    end=80;
                    break;
                case 2:
                    start=80;
                    end=100;
                    break;
            }
        }

    }
}
