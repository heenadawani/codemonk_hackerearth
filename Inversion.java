import java.util.*;
class Inversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int a[][]=new int[n][n];
            for(int j=0;j<n;j++)
                for(int k=0;k<n;k++)
                    a[j][k]=sc.nextInt();
            int count=0;
            for(int j=0;j<n;j++)
                for(int k=0;k<n;k++)
                    for(int l=j;l<n;l++)
                        for(int m=k;m<n;m++)
                            if(a[j][k]>a[l][m])
                                count++;
            System.out.println(count);
        }
    }
}