package CH12Assignment;
class college{
    private String collegename;
    private String collegeloc;
    public college(String collegename,String collegeloc){
        this.collegename=collegename;
        this.collegeloc=collegeloc;
    }
    public void displaycollegeinfo(){
        System.out.println("College name:- "+collegename);
        System.out.println("College location:- "+collegeloc);
    }
}
class student{
    private int studentid;
    private String studentname;
    college studentcol;
    public student(int studentid,String studentname,college studentcol){
        this.studentid=studentid;
        this.studentname=studentname;
        this.studentcol=studentcol;
    }
    public void displaystudentinfo(){
        System.out.println("Student id:- "+studentid);
        System.out.println("Student Name:- "+studentname);
        System.out.println( "Student College info:");
        studentcol.displaycollegeinfo();
    }
}
public class CollegeMain {
    public static void main(String[] args) {
        college  c1 = new college("Silicon UNI","Patia");
        college  c2 = new college("KIIT UNI", "Patia");
        student s1 =new student(909090,"PPPP",c1);
        student s2=new student(9009,"Ssss",c2);
        s1.displaystudentinfo();
        s2.displaystudentinfo();
    }
}
