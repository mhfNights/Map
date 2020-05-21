public class Auto {
    private String brand;
    private int length;
    private int price;

    Auto(){
        super();
    }

    Auto(String brand,int length,int price){
        this.brand = brand;
        this.length = length;
        this.price = price;
    }

    public String getbrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
