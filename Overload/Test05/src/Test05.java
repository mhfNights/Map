//定义printX方法，打印任意行的图形。
public class Test05 {
    public static void main(String[] args) {
        printX(20);
    }
    public static void printX(int m){
        for(int i = 1;i < m;i++){
            for (int j = 1; j <= m; j++){
                if((i == j)|| i + j ==m+1){
                    System.out.print("*");
                }else {
                    System.out.print("&");
                }
            }
            System.out.println();
        }
    }
}
