abstract class Poultry {
    private String name;
    private String symptom;
    private int age;
    private String illness;

    public abstract void showSymptom();

    public void showMsg(){
        System.out.println("动物名称："+name);
        System.out.println("年龄："+age);
        System.out.println("病因："+illness);
    }

     Poultry(){
        super();
    }

     Poultry(String name,String symptom,String illness,int age){
         this.name = name;
         this.symptom = symptom;
         this.illness = illness;
         this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
