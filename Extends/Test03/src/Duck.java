public class Duck extends Poultry{
    @Override
    public void showSymptom() {
        System.out.println("症状："+getSymptom());
    }

    Duck(){
        super();
    }

    Duck(String name,String symptom,String illness,int age){

        super(name,illness,symptom,age);
    }
}
