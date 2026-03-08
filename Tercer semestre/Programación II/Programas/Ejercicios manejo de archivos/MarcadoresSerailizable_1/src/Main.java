public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea un objeto Empleado
        Empleados empleado = new Empleados("Juan Pérez", 28, 2500.50);

        // Mostrar información antes de marcar
        empleado.mostrarInfo();

        // Marcar al empleado como especial
        empleado.marcar();

        // Mostrar información después de marcar
        empleado.mostrarInfo();
    }
    
}
