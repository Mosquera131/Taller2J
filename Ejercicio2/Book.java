public class Book {
    String tittle;
    String author;
    Boolean disponible;


    public Book( String tittle,String author,Boolean disponible)
    {
        this.tittle= tittle;

        this.author= author;

        this.disponible= true;

    }

    public String getTittle()
    {
        return tittle;
    }


    public boolean isDisponible() {
        return disponible;
    }


    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

}
