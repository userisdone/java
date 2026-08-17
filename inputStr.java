import java.util.Scanner;
public class inputStr {
    public static void main(String args[]){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a String");
    String str1 = myObj.nextLine();
    System.out.println("Enter second string");
    String str2 = myObj.nextLine();

    //sting length

    System.out.println(str1.length());

    //string case
    System.out.println(str1.toUpperCase());
    System.out.println(str2.toLowerCase());

    //comparing strings

    int i=0,t=1;
    if(str1.length()==str2.length()){
        while(str1.charAt(i) != str2.charAt(i))
        i++;
    }
    if(i==str1.length()){
        System.out.println("Strings are same");
    }
    else{
        System.out.println("Strings are different");
    }

    //reverse
    StringBuffer s2 = new StringBuffer(str2);
    System.out.println(s2.reverse());

    //replace
    System.out.println(str1.replace("b","new"));
    }
}
