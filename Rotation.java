import java.io.*;
class Rotation
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			String[] line=br.readLine().split(" ");
			int n=Integer.parseInt(line[0]);
			int k=Integer.parseInt(line[1]);
			k=(k%n);
			String a=br.readLine();
			if(k==0)
				System.out.println(a);
			else
			{
				int po=ordinalIndexOf(a," ",n-k);
				String b=a.substring(po+1);
				String c=a.substring(0,po);
				System.out.println(b+" "+c);
			}
		}
	}
	public static int ordinalIndexOf(String a,String s,int n)
	{
		int pos=a.indexOf(s);
		while(--n > 0 && pos!=-1)
			pos=a.indexOf(s,pos+1);
		return pos;
	}
}