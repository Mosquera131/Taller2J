import java.util.ArrayList;
import java.util.List;

public class CuentoBancaria {
    private String numeroCuenta;
    private double saldo;
    private List<String> historialTransacciones;

    public CuentoBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.historialTransacciones = new ArrayList<>();
        this.historialTransacciones.add("Cuenta creada con saldo inicial: " + saldoInicial);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<String> getHistorialTransacciones() {
        return historialTransacciones;
    }


    public boolean realizarTransferencia(CuentoBancaria cuentaDestino, double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            cuentaDestino.recibirTransferencia(monto);
            registrarTransaccion("Transferencia a cuenta " + cuentaDestino.getNumeroCuenta() + " por " + monto);
            cuentaDestino.registrarTransaccion("Transferencia recibida de cuenta " + numeroCuenta + " por " + monto);
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
            return false;
        }
    }

    private void recibirTransferencia(double monto) {
        saldo += monto;
    }

    private void registrarTransaccion(String descripcion) {
        historialTransacciones.add(descripcion);
    }


    public void mostrarHistorial() {
        System.out.println("Historial de transacciones de la cuenta " + numeroCuenta + ":");
        for (String transaccion : historialTransacciones) {
            System.out.println(transaccion);
        }
    }
}
