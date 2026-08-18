import java.util.Scanner;
public class Factorial {
    int find(int x){
        if(x<0){
            System.out.println("Undefined");
            return 0;
        }
        if(x==0 || x==1)
            return 1;
        return x*find(x-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial");
        int a = sc.nextInt();
        Factorial fact = new Factorial();
        int ans = fact.find(a);
        System.out.println("factorial of "+a+" is "+ans);
        sc.close();
    }
}
