// Menú areas

import java.util.Scanner;

public class Sw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println(" Menú areas");
        System.out.println("1 - Circulo ");
        System.out.println("2 - triangulo");
        System.out.println("3 - rectangulo ");
        System.out.println("4 - cuadrado ");
        System.out.println("9 - salir");
        System.out.println(" Ingrese la opcion ");
        opcion=sc.nextInt();
        switch (opcion) {
            case 1: 
            System.out.println("valor del radio: ");
            int radio=sc.nextInt();
            double area=Math.PI*Math.pow(radio, 2);
            System.out.println("Area= "+area );
            break;
            case 2:
            System.out.println("Area del triangulo");
            break;
            case 3:
            System.out.println("Area del rectangulo");
            break;
            case 4:
            System.out.println("Area del cuadrado");
            break;
            case 9: 
            System.out.println("Gracias por usar este programa");
            break;
            default:
            System.out.println(" Opcion equivocada!");
        
        }
    }

}
