public class leap
{
	public static void main(String [] args)
	{
		int a=Integer.parseInt(args[0]);
		if (a%4==0)
		{
			if (a%100==0)
			{
				if (a%400==0)
				{
					System.out.println("the year " + a + "is a leap year");
		        }
				else 
					System.out.println("the year " + a + "is not a leap year");
		    }
		else System.out.println("the year " + a + "is a leap year");
		}
           	else System.out.println("the year " + a + "is a leap year");
		}
		
		else System.out.println("the year " + a + "is not a leap year");
		
	}
}
