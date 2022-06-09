package classobject;
class Author
{
	String name,mail;
	char gender;
	Author(String Name,String mail,char gender)
	{
		this.name=Name;
		this.mail=mail;
		this.gender=gender;
		
	}
}
class Book
{
	 private String name;
	 private double price;
	 private Author author;
	 private int qtyInStock;
	 Book(String name,Author author,double price,int qnt)
	 {
		 this.name=name;
		 this.author=author;
		 this.price=price;
		 this.qtyInStock=qnt;
	 }
	 void set_name(String name)
	 {
		 this.name=name;
	 }
	 void set_author(Author author)
	 {
		 this.author=author;
	 }
	 void set_price(double price)
	 {
		 this.price=price;
	 }
	 void set_qnt(int qnt)
	 {
		 this.qtyInStock=qnt;
	 }
	 String get_name()
	 {
		 return this.name;
	 }
	
	 double get_price()
	 {
		 return this.price;
	 }
	 int get_qtyInStock()
	 {
		 return this.qtyInStock;
	 }
	 void get_author()
	 {
		 System.out.println("name : "+this.author.name);
		 System.out.println("mail id : "+this.author.mail);
		 System.out.println("Gender : "+this.author.gender);
	 }
	 
	 
}


public class Encapsulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author aut1=new Author("Mahesh","Mahesh@gmail.com",'M');
		Author aut2=new Author("Charitha","Charitha@gmail.com",'F');
		Book book=new Book("MATHS",aut1,35.67,19);
		System.out.println("Name :"+book.get_name());
		System.out.println("Price : "+book.get_price());
		book.get_author();
		System.out.println("Quantity in stock: "+book.get_qtyInStock());
		book.set_name("Physics");
		book.set_price(50.122);
		book.set_qnt(55);
		book.set_author(aut2);
		System.out.println("\n\nModified: ");
		System.out.println("Name :"+book.get_name());
		System.out.println("Price : "+book.get_price());
		book.get_author();
		System.out.println("Quantity in stock: "+book.get_qtyInStock());
		
		
		

	}

}
