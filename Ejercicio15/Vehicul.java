public class Vehicul {
    private String marca;
    private String modelo;
    private int kilometraje;

    // Constructor
    public Vehicul(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    // Method to display vehicle details
    public void mostrarVehiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilometraje: " + kilometraje + " km");
    }

    // Method to perform maintenance
    public void registrarMantenimiento() {
        System.out.println("Mantenimiento registrado para " + modelo + " con kilometraje: " + kilometraje + " km");
    }
}
