package pac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CartTest {
	@Test(dataProvider="getData")
	public void addToCart(String catageory,String Product) {
		System.out.println("execute===>"+catageory+",product===>"+Product);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] objArr=new Object[5][2];
	objArr[0][0]="tv";
	objArr[0][1]="sony";
	objArr[1][0]="tv";
	objArr[1][1]="samsung";
	objArr[2][0]="tv";
	objArr[2][1]="lg";
	return objArr;
	}

}
