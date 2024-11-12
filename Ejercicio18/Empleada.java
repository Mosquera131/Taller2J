public class Empleada {
    private String nombre;
    private double pagoPorHora;
    private double horasTrabajadas;

    public Empleada(String nombre, double pagoPorHora) {
        this.nombre = nombre;
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = 0; // Inicialmente no se han registrado horas
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }


    public void registrarHoras(double horas) {
        if (horas > 0) {
            this.horasTrabajadas += horas;
        } else {
            System.out.println("Las horas no pueden ser negativas.");
        }
    }
}
