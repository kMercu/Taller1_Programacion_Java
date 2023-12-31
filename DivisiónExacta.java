import java.util.Scanner;

public class DivisiónExacta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo ");
        int dividendo = sc.nextInt();

        System.out.print("Ingrese el divisor ");
        int divisor = sc.nextInt();

        sc.close();

        if (divisor != 0) {
            int cociente = dividendo / divisor;
            int residuo = dividendo % divisor;

            if (residuo == 0) {
                System.out.println("La división es exacta.");
                System.out.println("Cociente: " + cociente);
            } else {
                System.out.println("La división no es exacta.");
                System.out.println("Cociente: " + cociente);
                System.out.println("Residuo: " + residuo);
            }
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
