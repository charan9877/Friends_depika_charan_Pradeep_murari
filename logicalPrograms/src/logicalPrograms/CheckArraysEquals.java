package logicalPrograms;

import java.util.Arrays;

public class CheckArraysEquals 
{
	public static void main(String[] args)
	{
		int ar[]={1,2,3,6,5,6,7};
		int art[]={1,2,3,4,5,6,7};
		
	boolean status=	Arrays.equals(ar, art);
	if(status==true)
	{
		System.out.println("Arrays are equal");
	}
	else
	{
		System.out.println("arrays are not equal");
	}
	
	//approach2
	boolean status1=true;
	
	if(ar.length==art.length)
	{
	for(int i=0; i<ar.length;i++)
	{
		if(ar[i]!=art[i])
		{
			status1=false;
		}
	}
	}
	else 
	{
		status1=false;
	}
	}
	
	

}
