public class Estudiante {
    //Creamos los atributos
    private String nombre;
    private int edad;
    private double promedio;
    private boolean esBecado;
    
    /* Constructor que permite inicializar los atributos 
    de la clase con valores específicos*/
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.esBecado = false; //Lo ponemos como no becado por defecto
    }
    
    //Para obtener los atributos

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public boolean isEsBecado() {
        return esBecado;
    }
    
     // Método para marcar al estudiante como becado
    public void otorgarBeca() {
        this.esBecado = true;
    }

    // Método para verificar si el estudiante es becado
    public boolean esBecado() {
        return esBecado;
    }

    // Método para mostrar información del estudiante
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio);
        if (esBecado) {
            System.out.println("Este estudiante tiene una beca.");
        }
    }
}