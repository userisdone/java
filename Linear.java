import java.util.*;
public class Linear {
    void linear(int array[],int target){
        int i=0;
        for(i=0;i<array.length;i++){
            if(array[i] == target){
                System.out.println("Target found");
                return;
            }
        }
        System.out.println("Target not found");
    }

    void Binary(int array[],int target){
        int s=0,end=array.length-1;
        while(s<=end){
            int mid = s+(end-s)/2;
            if(array[mid] == target){
                System.out.println("Target found");
                return;
            }
            else if(array[mid]<target){
                s=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Target not found");
    }
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find");
        int target = sc.nextInt();

        Linear obj = new Linear();
        obj.linear(array,target);
        
        obj.Binary(array,target);
        sc.close();
    }
}