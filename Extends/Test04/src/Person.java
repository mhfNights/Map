public class Person {
    private String name;
    private int age;

    public void showMsg(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }
    Person(){
        super();
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
