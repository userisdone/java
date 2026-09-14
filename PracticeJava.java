public class PracticeJava{
    public static void main(String args[]){
      int  nums[][] = new int[3][]; 

      int i,j;

      nums[0] = new int[3];
      nums[1] = new int[4];
      nums[2] = new int[2];

      for(i=0;i<nums.length;i++){
        for(j=0;j<nums[i].length;j++){
            nums[i][j] = (int)(Math.random()*100);
        }
      }

      for(int n[]:nums){
        for(int m:n){
            System.out.print(m+" ");
        }
        System.out.println();
      }
    }
}