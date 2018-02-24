import java.util.*;
 
 
class Welcome {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int sum[]=new int[n];
        for(int i=0;i<n;i++)
        
            a[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            sum[i]=a[i]+b[i];
        
         System.out.print(sum[i]+" ");}
    }
}