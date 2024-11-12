public class ControlDeHoras {
    private static final double HORAS_NORMALS = 40;
    private static final double PAGO_EXTRA = 1.5;  // 50% extra por las horas adicionales


    public double calcularSalarioSemanal(Empleada empleado) {
        double salario = 0;
        double horasTrabajadas = empleado.getHorasTrabajadas();

        if (horasTrabajadas <= HORAS_NORMALS) {
            // Solo horas normales
            salario = horasTrabajadas * empleado.getPagoPorHora();
        } else {
            // Horas normales + horas extras
            double horasExtras = horasTrabajadas - HORAS_NORMALS;
            salario = (HORAS_NORMALS * empleado.getPagoPorHora()) + (horasExtras * empleado.getPagoPorHora() * PAGO_EXTRA);
        }

        return salario;
    }
}
