import java.util.Scanner;
public class palindrome {
    boolean iSPalindrome(int x){
        int m,n=x,num=0;
        while(n>0){
            m=n%10;
            num=num*10+m;
            n=n/10;
        }
        if(num==x){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to find if it's palindrome");
        int n = sc.nextInt();
        palindrome obj = new palindrome();
        if(obj.iSPalindrome(n)){
            System.out.println("this is a palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
        sc.close();
    }
}
