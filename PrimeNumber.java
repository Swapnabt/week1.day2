package week2.day2;

public class PrimeNumber {

	public static void main(String[] args) {

		int a = 13;
		boolean flag = false;
		
	
		for (int i=2;i<a/2;i++)
			 
			
		{
		
			if (a/2==0)
				
			{
				flag=true;
				break;
				
			}
		}
		
		if (flag==false) {
			
			System.out.println(a + " is a Prime Number");
		}else
			System.out.println(a +  " is not a Prime Number");
		}
	

}

