public class Pasajero {
    private String nombre;
    private String documentoIdentidad;

    public Pasajero(String nombre, String documentoIdentidad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    // Método para realizar una reserva
    public Reserva hacerReserva(Vuelo vuelo) {
        return vuelo.reservarAsiento(this);
    }

    // Método para cancelar una reserva
    public void cancelarReserva(Vuelo vuelo, Reserva reserva) {
        vuelo.cancelarReserva(reserva);
    }
}
