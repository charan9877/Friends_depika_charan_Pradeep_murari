package logicalPrograms;

public class ThisKeyWord 
{
	int x;
	void add(int x)
	{
	this.x = x;
	}
public static void main(String[] args) {
	ThisKeyWord v1= new ThisKeyWord();
	v1.add(10);
}
}
