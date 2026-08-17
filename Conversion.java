import java.util.Scanner;
public class Conversion {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first num: ");
        String str1 = myObj.nextLine();
        System.out.println("Enter second num: ");
        String str2 = myObj.nextLine();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sum = num1+num2;
        String sums = Integer.toString(sum);
        System.out.println(sums); 
    }
}
