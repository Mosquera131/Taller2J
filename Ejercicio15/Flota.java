import java.util.ArrayList;

public class Flota {

    private ArrayList<Vehicul> vehiculos;

    public Flota() {
        this.vehiculos = new ArrayList<Vehicul>();
    }


    public void agregarVehiculo(Vehicul vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
    }

    public void registrarMantenimiento(int kilometraje) {
        for (Vehicul vehiculo : vehiculos) {
            if (vehiculo.getKilometraje() >= kilometraje) {
                vehiculo.registrarMantenimiento();
            }
        }
    }


    public void listarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos en la flota.");
        } else {
            for (Vehicul vehiculo : vehiculos) {
                vehiculo.mostrarVehiculo();
                System.out.println("--------------------------");
            }
        }
    }

    public void buscarVehiculosPorKilometraje(int kilometrajeMin, int kilometrajeMax) {
        boolean found = false;
        for (Vehicul vehiculo : vehiculos) {
            if (vehiculo.getKilometraje() >= kilometrajeMin && vehiculo.getKilometraje() <= kilometrajeMax) {
                vehiculo.mostrarVehiculo();
                System.out.println("--------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No se encontraron vehículos en este rango de kilometraje.");
        }
    }
}
