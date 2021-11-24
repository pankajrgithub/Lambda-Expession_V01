package consumer;

import java.util.function.Consumer;

public class Chaining {

	public static void main(String[] args) 
	{
	Consumer<String> con=s->System.out.println("This" +" "+s +" "+"is white");	
	Consumer<String> con1=s->System.out.println("This" +" "+s +" "+"eating grass");
	Consumer<String> con2=s->System.out.println("This"+" " +s +" "+"having for lags");	
     
	
	
	/*con.accept("Cow");
	con1.accept("Cow");
	con2.accept("Cow"); */
	
	con.andThen(con1).andThen(con2).accept("Cow");  //chaining
	
	
	
	
	}

}
