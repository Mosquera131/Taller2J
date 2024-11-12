public abstract class Pago {
    protected double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    // Método abstracto para procesar el pago
    public abstract void procesarPago();

}
