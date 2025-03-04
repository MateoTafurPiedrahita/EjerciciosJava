import java.util.Scanner;

public class Entrada {
public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   System.out.println("Ingresa tu nombre: ");
String nombre = sc .nextLine();
System.out.println("Hola "+nombre);

System.out.println("Ingresa tu edad: ");
int edad = sc.nextInt();
System.out.println("Eres muy joven solamente tienes " +edad+ " años" );
}
    
}