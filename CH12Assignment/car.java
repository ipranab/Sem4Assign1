package CH12Assignment;
class cartester{
private String make;
private String model;
public cartester(String make,String model){
    this.make=make;
    this.model=model;
}
public String getMake(){
    return make;
}
public void setMake(String make){
    this.make=make;
}
public String getModel(){
    return model;
}
public void setModel(String model) {
    this.model=model;
}
}
public class car{
    public static void main(String[] args) {
        cartester mycar1=new cartester("Honda","Verna");
        cartester mycar2=new cartester(null,null);
        System.out.println("mymake:- "+mycar1.getMake() + " Model:- "+mycar1.getModel());
        System.out.println("mymake:- "+mycar2.getMake() + " Model:- "+mycar2.getModel());
        mycar2.setMake("Toyota");
        mycar2.setModel("WRv");
        System.out.println("update after progress:-"+"mymake:-"+mycar2.getMake()+ " My model:- "+mycar2.getModel());
    }
}
