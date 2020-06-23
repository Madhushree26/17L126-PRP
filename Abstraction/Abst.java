/* Class Author*/

public class Author {
	String name;
	String email;
	char gender;
	public Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}

/* Class Book*/

public class Book {
	String name;
	Author author;
	double price;
	int qty;
	public Book(String name, Author author, double price, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
	}
	
	public static void main(String args[])
	
	{
		Author a=new Author("Richard","abc@gmail.com",'F');
		Book b=new Book("Core Java",a,500,2);
		System.out.println(a);
		System.out.println(b);
				
				
	

}
}


