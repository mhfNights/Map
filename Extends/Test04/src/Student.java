public class Student extends Person{
    private int fraction;

    public void exam(){
        System.out.println("考了"+fraction+" 分");
    }

    Student(){
        super();
    }

    Student(String name,int age,int fraction){
        super(name,age);
        this.fraction = fraction;
    }

    public int getFraction() {
        return fraction;
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }
}
