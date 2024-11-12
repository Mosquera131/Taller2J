public abstract class PagoEfectivo extends Pago{
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago de $" + monto + " en efectivo.");
        // Aquí podría ir la lógica adicional para pagos en efectivo
    }
}
