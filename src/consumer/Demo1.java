package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String name;
	int salary;
	String gender;
	
	
	Employee(String name,int salary, String gender)
	{
		this.name=name;
		this.salary=salary;
		this.gender=gender;
	}
}

public class Demo1 {

	public static void main(String[] args) 
	{
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee("John",40000,"male"));
		list.add(new Employee("Mary",30000,"female"));
		list.add(new Employee("Smith",50000,"male"));
		list.add(new Employee("Eric",60000,"male"));

		
		Function<Employee,Integer> fn=s->(s.salary*10/100); //return bonus of employee
		
		
		Predicate<Integer> pr=b->(b>3000);  //return true if bonus value more than 6000
		
		Consumer<Employee> con=emp->
		{
		System.out.println("Employee Name:"+emp.name);
		System.out.println("Employee Salary:"+emp.salary);
		System.out.println("Employe Gender:"+emp.gender);
		};
		
		
		for(Employee em:list)
		{
			int bonus=fn.apply(em); //invoke function interface
			
			if(pr.test(bonus)) //invoke predicate interface
			{
				con.accept(em); //invoke consumer interface
				
				System.out.println("bonus of employee:"+bonus);
				
				System.out.println("=========================================");
			}
		}
	
		
	}

}
