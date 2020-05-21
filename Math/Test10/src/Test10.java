import java.util.ArrayList;
import java.util.Scanner;

//模拟用户登录。
//
//        * 定义用户类，属性为用户名和密码。
//        * 使用集合存储多个用户对象。
//        * 录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
//        * 登录失败时，当用户名错误，提示没有该用户。
//        * 登录失败时，当密码错误时，提示密码有误
public class Test10 {
   static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("张三","1234"));
        list.add(new User("张一","12345"));
        list.add(new User("张二","12346"));
        list.add(new User("张四","12347"));
        list.add(new User("张五","12348"));
        list.add(new User("张六","12349"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String psw = sc.next();
        User user = new User(name,psw);
        System.out.println(login(user));
    }
    public static String login(User user){
        String name = user.getName();
        String psw = user.getPsw();
        String msg = "";
        for (int i = 0; i <list.size() ; i++) {
            User u = list.get(i);
            String uName =u.getName();
            String uPsw =u.getPsw();
            if (name.equals(uName)) {
                if (psw.equals(uPsw)) {
                    return "登录成功";
                } else {
                    return "密码错误";
                }
            }else {
                msg = "用户名不存在";
            }
        }
        return msg;
    }
}
