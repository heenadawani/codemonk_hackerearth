import java.util.*;
class GoodString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=0,maxcount=0;
		
		for(int i=0;i<s.length();i++)
		{
		    int flag=0;
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				flag=1;
			}
			else
			{
			    flag=0;
			}
			if(flag==1)
			{    
			    c++;
			}
			else
			{
			    c=0;
			}
			if(c>maxcount)
			    maxcount=c;
		}
		System.out.println(maxcount);
	}
}