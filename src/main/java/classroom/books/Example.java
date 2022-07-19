package classroom.books;

public class Example {
    public static void main(String[] args) {
        Author  author = new Author("Jesus Cristus","jesus.cristus@haven.com");
        Book book = new Book("ISBN1", "The Holy Bible",author,20,50);
        System.out.println(book.toString());
        book.setPrice(20.5);
        book.setQty(2);
        System.out.println(book.toString());
    }
}
