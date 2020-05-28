public class Teacher {
    public void setStudent(Student s,double fraction) throws FractionException {
        if (fraction < 0){
            throw new FractionException("分数不能为负数");
        }
        s.setFraction(fraction);

    }
}
