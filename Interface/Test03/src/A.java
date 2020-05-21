public interface A {
    public abstract void showA();

    private void show10(String str){
        for (int i = 0; i <10 ; i++) {
            System.out.println(str);
        }
    }

    public default void showB10(String str){
        show10(str);
    }

    public default void showC10(String str){
        show10(str);
    }
}
