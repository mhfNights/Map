public class Card {
    private String hs;
    private String ds;
    public Card(String hs,String ds){
        this.ds=ds;
        this.hs=hs;
    }
    public  void show(){
        System.out.print(hs+ds+" ");
    }
}
