import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentoBancaria> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentoBancaria cuenta) {
        cuentas.add(cuenta);
    }


    public CuentoBancaria obtenerCuenta(String numeroCuenta) {
        for (CuentoBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        System.out.println("Cuenta no encontrada.");
        return null;
    }

    public boolean realizarTransferencia(String numeroCuentaOrigen, String numeroCuentaDestino, double monto) {
        CuentoBancaria  cuentaOrigen = obtenerCuenta(numeroCuentaOrigen);
        CuentoBancaria cuentaDestino = obtenerCuenta(numeroCuentaDestino);

        if (cuentaOrigen != null && cuentaDestino != null) {
            return cuentaOrigen.realizarTransferencia(cuentaDestino, monto);
        }
        return false;
    }


    public void mostrarHistorialCuentas() {
        for (CuentoBancaria cuenta : cuentas) {
            cuenta.mostrarHistorial();
        }
    }
}
