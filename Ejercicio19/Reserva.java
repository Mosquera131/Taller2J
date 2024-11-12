import java.util.Date;

public class Reserva {
    private Vuelo vuelo;
    private Pasajero pasajero;
    private int numeroAsiento;
    private Date fechaReserva;

    public Reserva(Vuelo vuelo, Pasajero pasajero, int numeroAsiento) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.numeroAsiento = numeroAsiento;
        this.fechaReserva = new Date(); // Fecha actual
    }

    // Métodos getter
    public Vuelo getVuelo() {
        return vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "vuelo=" + vuelo.getIdVuelo() +
                ", pasajero=" + pasajero.getNombre() +
                ", numeroAsiento=" + numeroAsiento +
                ", fechaReserva=" + fechaReserva +
                '}';
    }
}
