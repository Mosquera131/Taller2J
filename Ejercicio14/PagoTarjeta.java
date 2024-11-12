public abstract class PagoTarjeta extends Pago {
    private String numeroTarjeta;

    public PagoTarjeta(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago de $" + monto + " con tarjeta de número " + numeroTarjeta);
        // Aquí podría ir la lógica de validación y procesamiento del pago con tarjeta
    }
}
