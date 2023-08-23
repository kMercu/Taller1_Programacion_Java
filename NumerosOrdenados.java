import java.time.LocalDate;
import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Dia: ");
        int diaNacimiento = sc.nextInt();
        System.out.print("Mes: ");
        int mesNacimiento = sc.nextInt();
        System.out.print("Anno: ");
        int annoNacimiento = sc.nextInt();

        LocalDate currentDate = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(annoNacimiento, mesNacimiento, diaNacimiento);

        int edad = currentDate.minusYears(annoNacimiento).getYear();

        if (currentDate.isBefore(fechaNacimiento.withYear(currentDate.getYear()))) {
            edad--;
        }

        System.out.println("Usted tiene " + edad + " años");

        sc.close();
    }
}