public class Teacher extends Person{
    String subject;

    public void lecture(){
        System.out.println("讲授"+subject+"课");
    }

    Teacher(){
        super();
    }

    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
