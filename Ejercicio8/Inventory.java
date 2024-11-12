import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory()
    {
        this.products=new ArrayList<>();
    }


    public ArrayList<Product> buscar(String categorySearch){

        ArrayList<Product> productosfiltrado=new ArrayList<>();
        for (Product product: products)
        {
            if (product.getCategory().equalsIgnoreCase(categorySearch))
            {
                productosfiltrado.add(product);
            }

        }
        return productosfiltrado;
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for (Product product : products) {
            valorTotal += product.getPrice();
        }
        return valorTotal;
    }
}
