import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FechaNacimiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa su fecha de nacimiento. (dd/mm/aaaa): ");
        String fechaNacimientoStr = sc.nextLine();
        // sc.close();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = parseFecha(fechaNacimientoStr, dateFormat);
        Date fechaActual = new Date();
        
        int edad = calcularEdad(fechaNacimiento, fechaActual);
        
        System.out.println("Tu edad es: " + edad + " años.");
    }
    
    public static Date parseFecha(String fechaStr, SimpleDateFormat dateFormat) {
        try {
            return dateFormat.parse(fechaStr);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Usa dd/mm/aaaa.");
            System.exit(1);
            return null;
        }
    }
    
    public static int calcularEdad(Date fechaNacimiento, Date fechaActual) {
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() || 
            (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            edad--;
        }
        
        return edad;
    }
}
