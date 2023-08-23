import java.util.Scanner;

public class IndiceMasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese el IMC de la persona: ");
        double imc = sc.nextDouble();
        double riesgo = calcularRiesgoCoronario(edad, imc);

        System.out.println("El riesgo de enfermedad es: " + riesgo);

        sc.close();

    }//Cierra main

    
    public static double calcularRiesgoCoronario(int edad, double imc) {
        
        double riesgo = 0.0;

        riesgo = 0.5 * edad + 0.3 * imc;

        return riesgo;

    }//cierra calcularRiesgoCoronario
    
}//Cierra class