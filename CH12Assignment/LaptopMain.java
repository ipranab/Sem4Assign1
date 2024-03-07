package CH12Assignment;
class laptop{
    private String model;
    private int price;
    public void setmodel(String model){
        this.model=model;
    }
    public void setprice(int price){
        this.price=price;
    }
    public String toString(){
        return "Laptop Model:- "+model+"\n Price:- "+price;
    }
}
public class LaptopMain {
    public static void main(String[] args) {
        laptop l1 = new laptop();
        l1.setmodel("asusu");
        l1.setprice(90909090);
        System.out.println(l1.toString());
    }
}
