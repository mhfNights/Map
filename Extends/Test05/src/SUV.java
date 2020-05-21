public class SUV extends Auto {
    private int sLength = 4295;
    private int lLength = 5070;

    SUV(int length,int price){
        super("SUV",length,price);
    }

    public String JudgmentSize(int length){
        if (this.getLength()<sLength){
            return "小型车" ;
        }else if (length>=sLength&&length<lLength){
            return "中型车";
        }else {
            return "大型车";
        }
    }
}
