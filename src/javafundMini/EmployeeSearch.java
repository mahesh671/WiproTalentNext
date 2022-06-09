package javafundMini;

import java.util.Scanner;

public class EmployeeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id[] =new int[] {1001,1002,1003,1004,1005,1006,1007};
		String[] Emp_name=new String[] {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tamnay"};
		@SuppressWarnings("unused")
		String[] join_date= {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
		char[] desig_code= {'e','c','k','r','m','e','c'};
		String[] Department= {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int[] Basic= {20000,30000,10000,12000,50000,23000,29000};
		int[] Hra= {8000,12000,8000,6000,20000,9000,12000};
		int[] It= {3000,9000,1000,2000,20000,4400,10000};
		String designation="";
		int Da=0,salary;
		//Scanner sc =new Scanner(System.in);
		//System.out.println("Enter Employee Id :");
		int s_id=Integer.parseInt(args[0]);
		int i=0;
		for(;i<id.length;i++)
			if(id[i]==s_id)
				break;
		if (i<id.length)
		{
			switch(desig_code[i])
			{
			case 'e':
				designation="Engineer";
				Da=20000;
				break;
			case 'c':
				designation="Consultant";
				Da=32000;
				break;
			case 'k':
				designation="Clerk";
				Da=12000;
				break;
			case 'r':
				designation="Receptionist";
				Da=15000;
				break;
			case 'm':
				designation="Manager";
				Da=40000;
				break;
			}
			salary=Basic[i]+Hra[i]+Da-It[i];
			System.out.println("Emp No.\t Emp Name\t Department\tDesignation\tsalary");
			System.out.println(s_id+"\t"+Emp_name[i]+"\t\t"+Department[i]+"\t"+designation+"\t"+salary);
		}
		else
		{
			System.out.println("There is no employee id with "+s_id);
		}
			
		
	}

}
