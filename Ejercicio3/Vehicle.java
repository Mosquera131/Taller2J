public class Vehicle {
    String marca;
    String modelo;
    int velocidadMaxima;
    int velocidadActual;

    public Vehicle(String marca,String modelo,int velocidadMaxima, int velocidadActual)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMaxima=velocidadMaxima;
        this.velocidadActual=0;

    }

    public void acelerar( int incremeto)
    {
        if(incremeto<0)
        {
            System.out.println("The increment can not be ");
        }
        else {
            velocidadActual +=incremeto;

            if(velocidadActual>velocidadMaxima)
            {
                velocidadActual=velocidadMaxima;

            }
            System.out.println("you have reach the Maximum velocity allow");
        }

    }

    public void frenar(int disminucion)
    {
        if (disminucion<0)
        {
            System.out.println("the value can't be negative");
        }
        else {
            velocidadActual-=disminucion;
            if (velocidadActual<0)
            {
                velocidadActual=0;

            }
            System.out.println("you have stop");
        }
    }
}
