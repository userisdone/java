class student {
 int rollnum;
 String name;
 int Java_marks; 
 int SE_marks;
 int DevOps_marks;
    public student(int rollnum, String name, int Java_marks,int SE_marks,int DevOps_marks){
        this.rollnum = rollnum;
        this.name = name;
        this.Java_marks = Java_marks;
        this.SE_marks = SE_marks;
        this.DevOps_marks = DevOps_marks;
    }
    float totalMarks(){
        return Java_marks+SE_marks+DevOps_marks;
    }
    void percentage(){
        float total = totalMarks();
        float per = total/300;
        per = per*100;
        System.out.println("Percentage is: "+per);
        if(per>=90)
            System.out.println("Grade A");
        else if(per>=75)
            System.out.println("Grade B");
        else if(per>=60)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}
public class Main{
public static void main(String args[]){
student s1 = new student(1,"ivy",80,95,90);
s1.percentage();
}
}

