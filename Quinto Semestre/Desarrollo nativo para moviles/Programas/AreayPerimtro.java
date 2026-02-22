import java.util.Scanner;

class Rectangulo {
    
    //Atributos
    double base;
    double altura;

    //Constructor (Para crear el objeto)
    Rectangulo(double baseRectangulo, double alturaRectangulo){
        base = baseRectangulo;
        altura = alturaRectangulo;
    }

    //Metodos
    double calcularArea(){
        return base * altura;
    }

    double calcularPerimetro(){
        return 2*(base + altura);
    }
}

public class AreayPerimtro{
    public static void main(String[] args){
        //Declaración de scanner
        Scanner entrada = new Scanner(System.in);

        //Pedir datos
        System.out.println("Introduce la base del rectangulo: ");
        double baseIngresada = entrada.nextDouble();
        
        System.out.println("Introduce la altura del rectangulo: ");
        double alturaIngresada = entrada.nextDouble();
        
        //Crear rectangulo con los datos ingresados 
        Rectangulo miRectangulo = new Rectangulo(baseIngresada, alturaIngresada);

        //Calcular e imprimir
        System.out.println("El área del rectangulo es: " + miRectangulo.calcularArea());
        System.out.println("El perímetro del rectangulo es: " + miRectangulo.calcularPerimetro());

        entrada.close();

    }
}