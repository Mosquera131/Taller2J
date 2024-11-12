public class Product {
    String name;
    Double price;
    String category;

    public Product( String name,Double price, String category )
    {
        this.name=name;
        this.price= price;
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice()
    {
        return price;
    }
}
