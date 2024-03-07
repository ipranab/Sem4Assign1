package CH12Assignment;
class p1{
    private double x;
    private double y;
    public p1(double x,double y){
        this.x=x;
        this.y=y;
    }
    public p1(p1 otherp){
        this.x=otherp.getx();
        this.y=otherp.gety();
    }
    public double getx(){
        return x;
    }
    public void setx(double x){
        this.x=x;
    }
    public double gety(){
        return y;
    }
    public void sety(double y){
        this.y=y;
    }
}
public class Point {
    public static void main(String[] args) {
        p1 myp= new p1(2,4);
        System.out.println("The points are: X- "+myp.getx()+ " Y-"+myp.gety());
        p1 op=new p1(myp);
        op.setx(8);
        op.sety(10);
        System.out.println("After few modification:-");
        System.out.println("The points before:- "+myp.getx()+" and "+myp.gety());
        System.out.println("The points after mods:- "+op.getx()+" and "+op.gety());
    }
}
