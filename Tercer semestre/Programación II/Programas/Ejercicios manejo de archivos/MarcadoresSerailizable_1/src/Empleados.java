


public class Empleados {
    //Creamos los atributos
    private String nombre;
    private int edad;
    private double salario;
    private boolean esMarcado;//Para marcar si el empleado es especial o no
    
    /* Constructor que permite inicializar los atributos 
    de la clase con valores específicos*/

    public Empleados(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.esMarcado = false; //Por defecto esta no esta marcado
    }
    
    //Para obtener los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public boolean isEsMarcado() {
        return esMarcado;
    }
    // Establecer el marcador como verdadero
    public void marcar() {
        this.esMarcado = true;
    }

    // Verificar si el objeto está marcado
    public boolean esMarcado() {
        return esMarcado;
    }

    // Mostrar la información del empleado
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
        if (esMarcado) {
            System.out.println("Este empleado esta marcado como especial.");
        }
    }
}
