import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//六、使用SimpleDateFormat类,
// 把2018-03-04转换为2018年03月04日
public class Test06 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = s1.parse("2018-03-04");
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = s2.format(date);
        System.out.println(format);

    }
}
