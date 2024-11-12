import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Book> books;

    public Biblioteca()
    {
        books=new ArrayList<>();
    }

    public boolean prestarBook(String tittle)
    {
        for(Book book : books)
        {
            if (book.getTittle().equalsIgnoreCase(tittle))
            {
                if ((book.isDisponible()))
                {
                    book.prestar();
                    System.out.println("The book "+ tittle+ "has been barrow");
                    return true;
                }
                else
                {

                    System.out.println("The book is already barrow");
                    return false;
                }

            }
        }
        System.out.println("the book is not in out system");
        return  false;
    }


    public boolean devolverLibro(String tittle) {
        for (Book book : books) {
            if (book.getTittle().equalsIgnoreCase(tittle)) {
                if (!book.isDisponible()) {
                    book.devolver();
                    System.out.println("The book \"" + tittle + "\" has been give back.");
                    return true;
                } else {
                    System.out.println("The book \"" + tittle + "\" was not barrow.");
                    return false;
                }
            }
        }
        System.out.println("the book  \"" + tittle + "\" doesn't found in the library");
        return false;
    }
}
