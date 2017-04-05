import java.util.Random;
class CoinFlip2
{
	public static void main(String args[])
	{
		Random r = new Random();
		int head=0;
		for(int i=0;i<1000;i++)
		{
			int side=r.nextInt(2);
			if(side==1)
			{
				head++;
			}
		}
		System.out.println("Head count: "+head);
		System.out.println("tail count: "+(1000-head));

	}
}
