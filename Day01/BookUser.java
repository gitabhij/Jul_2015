public class BookUser {
	public static void main(String[] args) {
		Book book1 = new Book("Pragmatic Scala","Venkat",39.99);
		//book1.title = "Heheheheheh";
		//book1.author ="hohohohohohoh";
		
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		//book1.price = -1;
		book1.setPrice(-1);
		book1.setPrice(29.99);
		
		//book1.numberOfPages = -100;
		book1.setNumberOfPages(-100);
		
		// book1.title = "Pragmatic Scala";
		// book1.author = "Venkat";
		// book1.price = 39.99;
		
		Book book2 = new Book("Thinking in Java","Bruce Eckel",19.99);
		// book2.title = "Thinking in Java";
		// book2.author = "Bruce Eckel";
		// book2.price = 19.99;
		
	}
}