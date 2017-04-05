import java.util.Scanner;
class LeapYear2
{
	public static void main(String args[])
	{
		System.out.println("Enter the Year : ");
		Scanner sc= new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0 || year%400==0 && year%100!=0)
		{
			System.out.println("Leap year");
		}

		else
		{
			System.out.println("year is not Leap year.");
		}
	}
}

