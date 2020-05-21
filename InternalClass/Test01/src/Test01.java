//定义HandleAble接口，具备一个处理字符串数字的抽象方法方法HandleString（String num）。
//        * 处理方式1：取整数部分。
//        * 处理方式2：保留指定位小数，四舍五入
public class Test01 {
    public static void main(String[] args) {
        String str = "7.8754378";
        System.out.println("源字符串："+str);
        HandleAble h1 = new HandleAble() {
            @Override
            public String HandleString(String num) {
                return str.substring(0,str.indexOf("."));
            }
        };
        String s1 = h1.HandleString(str);
        System.out.println("取整："+s1);
        int num = 5;
        HandleAble h2 = new HandleAble() {
            @Override
            public String HandleString(String str) {
                int i = str.indexOf(".")+num+1;
                char c =str.charAt(i);
                if (c<=4){
                    return str.substring(0,i).toString();
                }else {
                    char c1 = (char) (str.charAt(str.indexOf(".")+num)+1);
                    return str.substring(0,i-1)+c1;
                }
            }
        };
        String s2 = h2.HandleString(str);
        System.out.println("保留"+num+"位小数："+s2);
    }
}
