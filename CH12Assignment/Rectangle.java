package CH12Assignment;
class rect{
    private double length;
    private double width;
    public rect(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double getlength(){
        return length;
    }
    public void setlength(){
        this.length=length;
    }
    public double getwidth(){
        return width;
    }
    public void setwidth(){
        this.width=width;
    }
    public double area(){
        return length*width;
    }
    public double  perimeter(){
        return 2*(length+width);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        rect myrect=new rect(20, 30);
        System.out.println("Intial length:- "+myrect.getlength()+  " Initial Width:- "+myrect.getwidth());
        System.out.println("The area is:- "+myrect.area()+ " The perimeter is:- "+myrect.perimeter());
    }
}
