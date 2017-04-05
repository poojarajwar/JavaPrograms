import java.util.Scanner;
class Hello2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		char ch; 
		do
		{
		System.out.println("Enter the range upto 0 to 30...");
		n=sc.nextInt();
		int powerOfTwo=1;
		if(n<=30)
		{
			for(int i=0;i<n+1;i++)
			{
				System.out.println(i+" = "+powerOfTwo);
				powerOfTwo=2*powerOfTwo;
			}
			
		}
		else
		{
			System.out.println("sorry out of range..");
		}
		System.out.println("Do u want Continue..press y ...");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("Thank u...");
	}
}
