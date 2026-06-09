import java.util.Scanner;

public class ventas {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double venta, total = 0, mayor = 0, menor = 0;
        int cantidad = 0;

        System.out.print("Venta: ");
        venta = leer.nextDouble();

        while (venta != 0) {

            if (cantidad == 0) {
                mayor = venta;
                menor = venta;
            }

            if (venta > mayor) {
                mayor = venta;
            }

            if (venta < menor) {
                menor = venta;
            }

            total += venta;
            cantidad++;

            System.out.print("Venta: ");
            venta = leer.nextDouble();
        }

        System.out.println("Cantidad de ventas: " + cantidad);
        System.out.println("Venta mayor: " + mayor);
        System.out.println("Venta menor: " + menor);
        System.out.println("Total vendido: " + total);
        System.out.println("Promedio: " + (total / cantidad));

        leer.close();
    }
}
