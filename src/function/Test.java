package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	public String name;
	public int salary;
	
	
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
}

public class Test {

	public static void main(String[] args) 
	{
		
    List<Employee> al=new ArrayList<Employee>();
    
    al.add(new Employee("John",50000));
    al.add(new Employee("smith",60000));
    al.add(new Employee("Tom",30000));
    al.add(new Employee("Monica",40000));
    
   // to get employees bonus based on salary using lambda expression.
    Function<Employee,Integer> fn=e->  //function use two argument 'any type' and 'any return type' 
                                  {
    	                           int sal=e.salary;
    	                           if(sal>10000 && sal<20000)
    	                        	   return sal*10/100;
    	                           else if(sal>20000 && sal<40000)
    	                           return sal*20/100;
    	                           else if(sal>40000 && sal<60000)
    	                        	   return sal*30/100;
    	                           else
    	                        	   return sal*40/100;
                                  };
    // to check condition bonus should be more than 30000 than only print employee details
    
    Predicate<Integer> pr=emp->(emp>18000);                              
                                  
    for(Employee e:al)
    {
    	int bonus=(fn.apply(e));
    	
    	if(pr.test(bonus))
    	{
    	System.out.println(e.name+" "+e.salary);
    	System.out.println("bonus:"+bonus);
    	}
    }
   
   
	}

}
