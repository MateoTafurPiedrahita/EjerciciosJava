// Menú areas

import java.util.Scanner;

public class Sw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Mostrar el menú de opciones
        System.out.println(" Menú de Áreas");
        System.out.println("1 - Círculo ");
        System.out.println("2 - Triángulo");
        System.out.println("3 - Rectángulo ");
        System.out.println("4 - Cuadrado ");
        System.out.println("9 - Salir");
        System.out.println("Ingrese la opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1: 
                System.out.println("Ingrese el valor del radio: ");
                double radio = sc.nextDouble();
                double areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.println("Área del círculo = " + areaCirculo);
                break;

            case 2:
                System.out.println("Ingrese la base del triángulo: ");
                double baseTriangulo = sc.nextDouble();
                System.out.println("Ingrese la altura del triángulo: ");
                double alturaTriangulo = sc.nextDouble();
                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("Área del triángulo = " + areaTriangulo);
                break;

            case 3:
                System.out.println("Ingrese la base del rectángulo: ");
                double baseRectangulo = sc.nextDouble();
                System.out.println("Ingrese la altura del rectángulo: ");
                double alturaRectangulo = sc.nextDouble();
                double areaRectangulo = baseRectangulo * alturaRectangulo;
                System.out.println("Área del rectángulo = " + areaRectangulo);
                break;

            case 4:
                System.out.println("Ingrese el lado del cuadrado: ");
                double lado = sc.nextDouble();
                double areaCuadrado = lado * lado;
                System.out.println("Área del cuadrado = " + areaCuadrado);
                break;

            case 9: 
                System.out.println("Gracias por usar este programa");
                break;

            default:
                System.out.println("¡Opción equivocada!");
        }

        sc.close(); // Cerrar Scanner
    }
}
