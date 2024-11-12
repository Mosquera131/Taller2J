public class Producto {
    String name;
    double price;
    int stock;

    public Producto(String name, double price, int stock )
    {
        this.name = name;
        this.price = price;
        this.stock = stock;

    }
    public void aumentarstock(int cantidad){
        if(cantidad>0)
        {
            this.stock += cantidad;
        }
        else
        {
            System.out.println("la cantidad debe ser  mayor a 0");
        }
    }

    public void disminuir(int cantidad ){
        if(cantidad>0 && cantidad<=this.stock )
        {
            this.stock-=cantidad;
        }
        else {
            System.out.println("la cantodad no puede ser negativa.");
        }
    }

    public double valortotal()
    {
        return   this.price * this.stock;
    }

}
