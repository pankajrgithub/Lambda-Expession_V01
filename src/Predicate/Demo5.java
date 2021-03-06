package Predicate;

import java.util.function.Predicate;

public class Demo5 {

	
	public static void main(String[] args) 
	{
		
		//Display even number whose value greater than 50
		
		Predicate<Integer> pr= e->(e%2==0);
		Predicate<Integer> pr1=e->e>50;
		
		int a[]= {5,10,12,15,20,25,30,35,40,45,50,55,56,60};
        
		System.out.println("Odd number whose value");
		
		for(int value:a)
		{
			//if(pr.test(value) && pr1.test(value))
			// if(pr.and(pr1).test(value))       //and condition will give result where both condition got pass
			if(pr.or(pr1).test(value))   //OR will check either one condition should be true
		//	if(pr.negate().test(value))
			{
				System.out.println(value);
			}
		}
	}

}
