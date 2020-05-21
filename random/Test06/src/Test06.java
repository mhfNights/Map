import java.util.ArrayList;
import java.util.Random;

//随机生成n张扑克牌。
//        - 使用集合保存所有的扑克牌对象。
//        - 从所有牌中，随机移除n张牌，保存到新集合。
//        - 判断n的值，不能超越一副扑克牌的范围。
public class Test06 {
    public static void main(String[] args) {
        printCard(radomList(14),14);
        printCard(radomList(27),27);
    }
//    创建扑克牌ArrayList
    public static ArrayList<Card> allCard(){
        ArrayList<Card> allList=new ArrayList<>();
        String [] hs={"梅花","方块","红心","黑桃"};
        String [] ds={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i <hs.length ; i++) {
            for (int j = 0; j <ds.length ; j++) {
                Card card= new Card(hs [i],ds [j]);
                allList.add(card);
            }
        }
        return allList;
    }
//    创建抽取n个卡牌的ArrayList
    public static ArrayList<Card> radomList(int n){
        if (n>54||n<=0){
            return null;
        }

        Random r=new Random();
        ArrayList<Card> cards=allCard();
        ArrayList<Card> rcard=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int index=r.nextInt(cards.size());
            Card card=cards.remove(index);
            rcard.add(card);
        }
        return rcard;
    }
//    打印随机生成的扑克牌
    public static void printCard(ArrayList<Card> cardList, int n){
        System.out.println("随机生成"+n+"张牌：");
        for (int i = 0; i <cardList.size() ; i++) {
            Card card=cardList.get(i);
            card.show();
        }
        System.out.println();
    }
}
