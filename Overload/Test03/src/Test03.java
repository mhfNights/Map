//定义showColor方法，根据英文单词，输出对应的颜色。
public class Test03 {
    public static void main(String[] args) {
        showColor("red");
        showColor("blue");
        showColor("green");
        showColor("blues");
    }
    public static void showColor(String color){
        switch (color){
            case "red":
                System.out.println(color+"是红色");
                break;
            case "green":
                System.out.println(color+"是绿色");
                break;
            case "blue":
                System.out.println(color+"是蓝色");
                break;
            default:
                System.out.println("请输入正确的单词");
                break;

        }
    }
}
