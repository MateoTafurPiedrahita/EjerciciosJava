/*
 Una heladería desea obtener un reporte semanal de ventas. 
 Para ello debe capturar en un sistema todas las facturas de ventas realizadas. 
 Cada factura contiene la cantidad y el sabor de las paletas vendidas. 
 Los sabores y los precios son: limón ($2500), nuez ($2800), lulo ($2600),
fresa ($2000) y crema ($3000). 
El sistema debe imprimir la cantidad de paletas vendidas de cada
sabor, el valor vendido y la venta total. 
Considere que una factura puede tener varias paletas de diferentes sabores.
 */




import java.util.Scanner;

public class ReporteHeladeria {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean indSabor = true, indFac = true;
        int acumLimon = 0, acumNuez = 0, acumLulo = 0, acumFresa = 0, acumCrema = 0;
        int numFac = 1;
        
        while (indFac) {
            System.out.println("No. Factura " + numFac);
            indSabor = true;
            
            while (indSabor) {
                System.out.println("Menú sabores");
                System.out.println("1 Limón");
                System.out.println("2 Nuez");
                System.out.println("3 Lulo");
                System.out.println("4 Fresa");
                System.out.println("5 Crema");
                int sabor = sc.nextInt();
                sc.nextLine();
                
                switch (sabor) {
                    case 1:
                        System.out.println("Cantidad de paletas de limón");
                        int cantL = sc.nextInt();
                        sc.nextLine();
                        acumLimon += cantL;
                        break;
                    case 2:
                        System.out.println("Cantidad de paletas de Nuez");
                        int cantN = sc.nextInt();
                        sc.nextLine();
                        acumNuez += cantN;
                        break;
                    case 3:
                        System.out.println("Cantidad de paletas de Lulo");
                        int cantLu = sc.nextInt();
                        sc.nextLine();
                        acumLulo += cantLu;
                        break;
                    case 4:
                        System.out.println("Cantidad de paletas de Fresa");
                        int cantF = sc.nextInt();
                        sc.nextLine();
                        acumFresa += cantF;
                        break;
                    case 5:
                        System.out.println("Cantidad de paletas de Crema");
                        int cantC = sc.nextInt();
                        sc.nextLine();
                        acumCrema += cantC;
                        break;
                    default:
                        System.out.println("Error en el sabor ingresado");
                        continue;
                }
                
                System.out.println("¿Desea incluir otro sabor? (S/N)");
                String rta = sc.nextLine().toUpperCase();
                indSabor = rta.equals("S");
            }
            
            System.out.println("¿Deseas registrar otra factura? (S/N)");
            String rta = sc.nextLine().toUpperCase();
            indFac = rta.equals("S");
            numFac++;
        }
        
        System.out.println("\nResumen de ventas:");
        System.out.println("Sabor     Cant. Venta   Total Venta");
        System.out.printf("Limón     %d          %d\n", acumLimon, acumLimon * 2500);
        System.out.printf("Nuez      %d          %d\n", acumNuez, acumNuez * 2800);
        System.out.printf("Lulo      %d          %d\n", acumLulo, acumLulo * 2600);
        System.out.printf("Fresa     %d          %d\n", acumFresa, acumFresa * 2000);
        System.out.printf("Crema     %d          %d\n", acumCrema, acumCrema * 3000);
        
        int totalVentas = (acumLimon * 2500) + (acumNuez * 2800) + (acumLulo * 2600) + (acumFresa * 2000) + (acumCrema * 3000);
        System.out.println("\nVenta total: $" + totalVentas);
        
    }
}
