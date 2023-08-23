import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        // En esta parte creamos un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitamos los datos al usuario para que ingrese un año
        System.out.print("Ingrese un año: ");
        int año = sc.nextInt();
        
        // Verificamos si el año es bisiesto
        boolean esBisiesto = esBisiesto(año);
        
        // Mostramos el resultado
        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
        
        // Cerramos el objeto Scanner
        sc.close();
    }//Cierra main
    
    // Con este metodo verificamos si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }//Cierra esBisiesto
}//Cierra class
