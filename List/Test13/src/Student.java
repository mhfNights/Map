import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private float fraction;

    public Student() {
    }

    public Student(String name, int age, float fraction) {
        this.name = name;
        this.age = age;
        this.fraction = fraction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Float.compare(student.fraction, fraction) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名：'" + name + '\'' +
                ", 年龄：" + age +
                ", 分数：" + fraction +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, fraction);
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

    public float getFraction() {
        return fraction;
    }

    public void setFraction(float fraction) {
        this.fraction = fraction;
    }

    @Override
    public int compareTo(Student o) {
        if (this.fraction > o.fraction){
            return -1;
        }else if (this.fraction < o.fraction){
            return 1;
        }else if (this.age > o.age){
            return 1;
        }else if (this.age < o.age){
            return -1;
        }
        return 0;

    }
}
