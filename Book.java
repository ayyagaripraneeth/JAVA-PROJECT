class Book {
   	public String title_of_book;
	public String author;
	public String year_of_publication;
	
	public static void main(String[] args){

		//object 1 creation
		Book Book1= new Book();
		Book1.title_of_book="Wings of Fire";
		Book1.author="A.P.J Abdul Kalam";
		Book1.year_of_publication="1948";
		
		//calling object1
		System.out.println("Name of the book is "+Book1.title_of_book);
		System.out.println("Author of the book is "+Book1.author);
		System.out.println("Year of Publication of book is "+Book1.year_of_publication);
               
		//object 2 creation
		Book Book2= new Book();
		Book2.title_of_book="Mahabharatham";
		Book2.author="Maharshi Veda Vyasa";
		Book2.year_of_publication="500AD";
		
		//calling object1
		System.out.println("Name of the book is "+Book2.title_of_book);
		System.out.println("Author of the book is "+Book2.author);
		System.out.println("Year of Publication of book is "+Book2.year_of_publication);
	}
}




