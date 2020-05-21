import java.util.ArrayList;

public class MyList {
    ArrayList<String> myList=new ArrayList<>();
    public void add(String s){
        myList.add(s);
    }
    public String remove(){
        String s1= myList.remove(myList.size()-1);
        return s1;
    }
    public void show(){
        System.out.println(myList);
    }
}
