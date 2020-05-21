import java.util.Random;

//随机验证码。
//
//        * 随机生成十组六位字符组成的验证码。
//        * 验证码由大小写字母、数字字符组成。
public class Test01 {
    public static void main(String[] args) {
        System.out.println("你的验证码为："+getCaptcha());
        System.out.println("你的验证码为："+getCaptcha());
        System.out.println("你的验证码为："+getCaptcha());
        System.out.println("你的验证码为："+getCaptcha());
        System.out.println("你的验证码为："+getCaptcha());
        System.out.println("你的验证码为："+getCaptcha());
    }
    public static String getCaptcha(){
        char [] code= {'0', '1', '2', '3', '4', '5', '6',
                '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
                'z'};
        String captcha="";
        Random r=new Random();
        for (int i = 0; i < 6; i++){
            captcha+=code [r.nextInt(code.length)];
        }
        return captcha;

    }
}
