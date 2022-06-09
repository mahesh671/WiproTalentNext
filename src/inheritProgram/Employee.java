package inheritProgram;

public class Employee extends Person {
	double salary;
	int year;
	String i_no;
	Employee(String name,double salary,int year,String i_no)
	{
		this.name=name;
		this.salary=salary;
		this.year=year;
		this.i_no=i_no;
	}
	void set_name(String name)
	{
		this.name=name;
	}
	void set_salary(double salary)
	{
		this.salary=salary;
	}
	void set_year(int y)
	{
		this.year=y;
	}
	void set_i_no(String i_no)
	{
		this.i_no=i_no;
	}
	String get_name()
	{
		return this.name;
	}
	int get_year()
	{
		return this.year;
	}
	double get_salary()
	{
		return this.salary;
	}
	String get_i_no()
	{
		return this.i_no;
	}

}
