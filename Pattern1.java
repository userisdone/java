public class Pattern1 {
    int i=0,j=0,n=5;
    void pyramid()
    {
     System.out.println("Pyramid Pattern");
     for(i=0;i<n;i++){
        int k;
        for(k=n-1;k>i;k--){
            System.out.print(" ");
        }
        for(j=0;j<=2*i;j++){
            System.out.print("*");
        }
        System.out.println();
        k--;
     }   
    }   
    void floyd(){
        int k=1;
        System.out.println("Floyd's Pattern");
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print((k++)+" ");
            }
            System.out.println();
        }
    } 
    void pascal(){
        int k=0;
        System.out.println("Pascal's Triangle");
        for(i=0;i<n;i++){
            for(k=n;k>i;k--){
                System.out.print(" ");
            }
            int num = 1;
            for(j=0;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    void diamond(){
        System.out.println("Diamond Pattern");
        int k=0,s;
        for(i=0;i<=2*n;i++){
            k=i<=n?i:(2*n-i);
            for(s=n-k;s>0;s--){
                System.out.print(" ");
            }
            for(j=0;j<=k;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void hollow(){
        System.out.println("Hollow Triangle");
        int k=0;
        for(i=0;i<n;i++){
            for(k=n;k>i;k--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                if(j==0 || i==j || i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    void number(){
        System.out.println("Number pattern");
         for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    Pattern1 obj = new Pattern1();
    obj.pyramid();
    obj.floyd();
    obj.pascal();
    obj.diamond();
    obj.hollow();
    obj.number();
    }
}
