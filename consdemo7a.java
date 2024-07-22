package seleniumDemo;

public class consdemo7a 
{
	int i=5;
	consdemo7a(int a)
	{
		System.out.println("maa");
		i=a;
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		
		consdemo7a v1= new consdemo7a(10);
		System.out.println(v1.i);
		
		consdemo7a v2= new consdemo7a(20);
		System.out.println(v2.i);
		
		System.out.println("Done");
		
		
	}

}
