package suplier;

import java.util.Date;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) 
	{
	//suplier interface not take any arugument and abstruc method is get()
		
		Supplier<Date> s=()->new Date();
		
		System.out.println(s.get());
        
	}

}
