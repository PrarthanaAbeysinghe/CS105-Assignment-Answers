public class Book {
 // declare instance variables
 String name;
 String author;
 String genre;
 float rating;
 
 // declare a class variable
 static float avg_rating;
 
 // define the constructor to initialize the instance variables
 Book(String n, String a, String g, float r) {
  this.name = n;
  this.author = a;
  this.genre = g;
  this.rating = r;
 }
 
 void displayDetails() {
  System.out.println("Name: " +name);
  System.out.println("Author: " +author);
  System.out.println("Genre: " +genre);
  System.out.println("Rating: " +rating);
  System.out.println();
 }

 public static void main(String[] args) {
  // create instances and pass the values for each instance variables as arguments
  Book book1 = new Book("Harry Potter And The Deathly Hallows", "J.K. Rowling", "Fantasy", 4.62f);
  Book book2 = new Book("The Help", "Kathryn Stockett", "Fiction", 4.46f);
  Book book3 = new Book("A Game of Thrones", "George R.R. Martin", "Fantasy", 4.45f);
  
  // call displayDetails method to display the book details
  book1.displayDetails();
  book2.displayDetails();
  book3.displayDetails();
  
  // calculate the average rating
  Book.avg_rating = (book1.rating + book2.rating + book3.rating)/3;
  
  // display the average rating
  System.out.println("Average rating: " +avg_rating);
  
 }

}
