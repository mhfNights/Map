public class Person {
    private String name;
    private int hp;

    public Person() {
    }

    public Person(String name, int hp) throws hpException {
        this.name = name;
        if (hp>= 0){
            this.hp = hp;
        }else {
            throw new hpException("hp不能为负数");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
