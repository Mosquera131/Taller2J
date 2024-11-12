import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private String idVuelo;
    private String origen;
    private String destino;
    private List<Integer> asientosDisponibles;
    private List<Reserva> reservas;

    public Vuelo(String idVuelo, String origen, String destino, int numAsientos) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.asientosDisponibles = new ArrayList<>();
        this.reservas = new ArrayList<>();

        // Inicializar los asientos disponibles
        for (int i = 1; i <= numAsientos; i++) {
            asientosDisponibles.add(i);
        }
    }

    // Métodos getter
    public String getIdVuelo() {
        return idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public List<Integer> getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    // Verificar disponibilidad de asientos
    public boolean hayAsientosDisponibles() {
        return !asientosDisponibles.isEmpty();
    }

    // Reservar un asiento
    public Reserva reservarAsiento(Pasajero pasajero) {
        if (hayAsientosDisponibles()) {
            int asiento = asientosDisponibles.remove(0);  // Asignar el primer asiento disponible
            Reserva reserva = new Reserva(this, pasajero, asiento);
            reservas.add(reserva);
            return reserva;
        } else {
            System.out.println("No hay asientos disponibles en este vuelo.");
            return null;
        }
    }

    // Cancelar una reserva
    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        asientosDisponibles.add(reserva.getNumeroAsiento());
        System.out.println("Reserva cancelada. El asiento " + reserva.getNumeroAsiento() + " ahora está disponible.");
    }
}
