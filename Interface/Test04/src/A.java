public interface A {
    public abstract void showA();

    private static void show10(String str){
        for (int i = 0; i <10 ; i++) {
            System.out.println(str);
        }
    }

    public static void showB10(String str){
        show10(str);
    }

    public static void showC10(String str){
        show10(str);
    }
}
