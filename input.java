import java.util.*;
public class input {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name = myObj.nextLine();
        System.out.println("RollNumber ");
        int ShcolarNo = myObj.nextInt();
        System.out.println("Marks ");
        float marks = myObj.nextFloat();
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+ShcolarNo);
        System.out.println("Marks: "+marks);
        myObj.close();
    }
}
