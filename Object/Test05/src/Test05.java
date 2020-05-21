import java.text.SimpleDateFormat;
import java.util.Date;

//五、请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,
// 如2088-08-08 08:08:08
public class Test05 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateStr = df.format(date);
        System.out.println(dateStr);
    }

}
