import java.time.Year;
import java.util.Calendar;

//七、用程序判断2018年2月14日是星期几
public class Test07 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2018);
        c.set(Calendar.MONDAY,2);
        c.set(Calendar.DATE,14);
        int year = c.get(Calendar.YEAR);
        int monday = c.get(Calendar.MONDAY);
        int day = c.get(Calendar.DATE);
        int i = c.get(Calendar.DAY_OF_WEEK);
        char week = getWeek(i);
        System.out.println(year+"年"+monday+"月"+day+"日"+"是星期"+week);
    }
    public static char  getWeek(int a){
        char [] c = {' ','日','一','二','三','四','五','六'};
        return c[a];
    }
}
