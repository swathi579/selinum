package pac;

import org.testng.annotations.Test;

public class Testing {
	@Test
	public void Testing()
	{
	int[] a={10,20,30,40,50,60,70,80,90,100};
	for(int i=1;i<=100;i++)
	{
	int count=0;
	for(int k:a)
	{
	if(i==k)
	{
	count++;
	break;
	}
	}
	if(count==0)
	System.out.println(i);
	}}

}
