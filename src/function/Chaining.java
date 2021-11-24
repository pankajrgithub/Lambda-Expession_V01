package function;

import java.util.function.Function;

public class Chaining {

	public static void main(String[] args) 
	{
		//andThen //first output input of second lambda function
        //compose //second funtion output pass to first lambda function
		
		Function<Integer,Integer> fn=n->(n*2);
		Function<Integer,Integer> fn1=n->(n*n*n);
		
		System.out.println(fn.andThen(fn1).apply(2)); //o/p-64 //in this case fn output pass to fn1
		System.out.println(fn.compose(fn1).apply(2)); // o/p-16 //in this case fn1 output pass to fn
	}

	}

