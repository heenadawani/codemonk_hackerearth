import java.util.*;
class Palindrome {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
			StringBuilder input1 = new StringBuilder();
			input1.append(s);
			input1 = input1.reverse();
			String r=input1.toString();
			if(s.equals(r))
			{
				if(s.length()%2==0)
					System.out.println("YES EVEN");
				else
					System.out.println("YES ODD");
			}
			else
				System.out.println("NO");
        }
    }
}