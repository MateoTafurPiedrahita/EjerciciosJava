import java.util.Scanner;

public class Heladeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean indsabor = true, indFactura = true;
        int acumLimon = 0, acumFresa = 0, acumLulo = 0, acumNuez = 0, acumCrema = 0;
        int acumFactura= 1;

        while (indFactura) {
            indsabor=true;
            System.out.println(" Desea incluir otra factura: (S/N) ");
            String rta = sc.nextLine();
            // if(rta=="S")
            if (rta.toUpperCase().equals("S"))
                indFactura = true;
            else
                indFactura = false;

        }

        while (indsabor) {
            System.out.println("Menú Sabores");
            System.out.println(" 1- Limóm");
            System.out.println(" 2- fresa");
            System.out.println(" 3 - Lulo");
            System.out.println(" 4 - Nuez");
            System.out.println(" 5 - Crema");
            System.out.println("Seleccione un sabor");
            int sabor = sc.nextInt();
            sc.nextLine();
            switch (sabor) {
                case 1:
                    System.out.println("Cantidad de paletas de limon: ");
                    int cantL = sc.nextInt();
                    // validar la cantidad ingresada
                    acumLimon += cantL;
                    break;

                default:
                    System.out.println("");
            }
            System.out.println(" Desea incluir otro sabor: (S/N) ");
            String rta = sc.nextLine();
            // if(rta=="S")
            if (rta.toUpperCase().equals("S"))
                indsabor = true;
            else
                indsabor = false;

        }
    }

}
