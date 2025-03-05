import java.util.Scanner;

public class ReporteHeladeriaMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguirFacturando = true;
        int totalLimon = 0, totalNuez = 0, totalLulo = 0, totalFresa = 0, totalCrema = 0;
        int numeroFactura = 1;

        while (seguirFacturando) {
            System.out.println("Factura No. " + numeroFactura);
            boolean seguirPidiendo = true;

            while (seguirPidiendo) {
                System.out.println("Menú de sabores");
                System.out.println("1. Limón");
                System.out.println("2. Nuez");
                System.out.println("3. Lulo");
                System.out.println("4. Fresa");
                System.out.println("5. Crema");
                System.out.println("Seleccione un sabor: ");
                int sabor = sc.nextInt();
                
                if (sabor < 1 || sabor > 5) {
                    System.out.println("Error: Sabor inválido");
                    continue;
                }
                
                System.out.println("Ingrese la cantidad de paletas: ");
                int cantidad = sc.nextInt();
                
                if (sabor == 1) totalLimon += cantidad;
                else if (sabor == 2) totalNuez += cantidad;
                else if (sabor == 3) totalLulo += cantidad;
                else if (sabor == 4) totalFresa += cantidad;
                else if (sabor == 5) totalCrema += cantidad;
                
                System.out.println("¿Desea agregar otro sabor? (S/N)");
                sc.nextLine(); 
                String respuesta = sc.nextLine().toUpperCase();
                seguirPidiendo = respuesta.equals("S");
            }
            
            System.out.println("¿Desea registrar otra factura? (S/N)");
            String respuesta = sc.nextLine().toUpperCase();
            seguirFacturando = respuesta.equals("S");
            numeroFactura++;
        }
        
        System.out.println("Resumen de ventas");
        System.out.println("Limón: " + totalLimon + " unidades - Total: " + (totalLimon * 2500));
        System.out.println("Nuez: " + totalNuez + " unidades - Total: " + (totalNuez * 2800));
        System.out.println("Lulo: " + totalLulo + " unidades - Total: " + (totalLulo * 2600));
        System.out.println("Fresa: " + totalFresa + " unidades - Total: " + (totalFresa * 2000));
        System.out.println("Crema: " + totalCrema + " unidades - Total: " + (totalCrema * 3000));
        
        int totalVenta = (totalLimon * 2500) + (totalNuez * 2800) + (totalLulo * 2600) + (totalFresa * 2000) + (totalCrema * 3000);
        System.out.println("Total de ventas: $" + totalVenta);
    }
}
