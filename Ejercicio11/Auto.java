public  class Auto  extends Vehicle{
    int numeroPuertas;

    public Auto(String marca,String modelo, int velocidadMaxima, int velocidadActual, int numeroPuertas)
    {
        super(marca, modelo, velocidadMaxima, velocidadActual);
        this.numeroPuertas = numeroPuertas;
    }

    public int descripcionPuerta()
    {
        return numeroPuertas;
    }
}
