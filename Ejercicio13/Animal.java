public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para hacer sonido, que cada subclase implementará
    public abstract void hacerSonido();
}
