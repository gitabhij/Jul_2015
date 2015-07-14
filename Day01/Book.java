public class Book {
	private String title;
	private double price;
	private String author;
	private int numberOfPages;
	
	//Function with the same name as the Class that does not return any value is called a "CONSTRUCTOR"
	public Book(String theTitle,String theAuthor,double thePrice){
		title = theTitle;
		author = theAuthor;
		price = thePrice;
	}
	public void setNumberOfPages(int pages){
		if(pages > 0)
		  numberOfPages = pages;
	}
	public void setPrice(double newPrice){
		if(newPrice < 0)
			System.out.println("Invalid price " + newPrice);
		else
			price = newPrice;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public double getPrice(){
		return price;
	}
		
	
	public String read(){
		return "Reading " + title;
	}
	public String buy(String store){
		return "Buying " + title + " from " + store;
	}
}