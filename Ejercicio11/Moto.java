public class  Moto extends  Vehicle {
    String tipoCasco;

    public Moto( String marca,String modelo, int velocidadMaxima,int velocidadActual)
    {
        super(marca,modelo,velocidadMaxima,velocidadActual);
        this.tipoCasco=tipoCasco;
    }


    public String informacionCasco()
    {
        return tipoCasco;
    }
}
