public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Se crea un objeto Estudiante
        Estudiante estudiante = new Estudiante("Laura Martinez", 20, 9.5);

        // Mostrar información antes de otorgar la beca
        estudiante.mostrarInfo();

        // Otorgar una beca al estudiante
        estudiante.otorgarBeca();

        // Mostrar información después de otorgar la beca
        estudiante.mostrarInfo();
    }
    
}
