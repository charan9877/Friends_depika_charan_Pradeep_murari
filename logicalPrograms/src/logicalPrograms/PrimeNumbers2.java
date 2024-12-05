package logicalPrograms;

public class PrimeNumbers2 
{
	public static void main(String[] args) {
		
		for(int i=2; i<=50;i++)
		{
			int number=0;
			for(int j=2; j<i/2;j++)
			{
				
				if(i%j==0)
				{
					number=1;
				}
				if(number==0)
				{
					System.out.println(i);
				}
			}
		}
				
	}
	}
