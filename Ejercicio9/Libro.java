public class Libro {
    String tittle;
    String author;
    int numberpage;

    public Libro(String tittle, String author, int numberpage )
    {
        this.tittle=tittle;
        this.author= author;
        this.numberpage= numberpage;
    }

    public void  imprimirResumen()
    {
        System.out.println("Author:" + this.author);
        System.out.println("Title:"+ this.tittle);

    }

    public void detalleLibro(int numberpage)
    {
        if(numberpage >=360)
        {
            System.out.println("the book:"+ this.tittle +"has more than 300 pages");
        }
        else {
            System.out.println("The book has less than 300 pages. ");
        }
    }
}
