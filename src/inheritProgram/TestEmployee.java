package inheritProgram;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj =new Employee("Mahesh",2500.25,2017,"19a81a0498");
		System.out.println(obj.get_name());
		System.out.println(obj.get_salary());
		System.out.println(obj.get_year());
		System.out.println(obj.get_i_no());
		obj.set_name("Kumar");
		obj.set_salary(17000.35);
		obj.set_year(2019);
		obj.set_i_no("19a81089");
		System.out.println(obj.get_name());
		System.out.println(obj.get_salary());
		System.out.println(obj.get_year());
		System.out.println(obj.get_i_no());
		
		
	}

}
