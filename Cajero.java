import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double saldo = 1000;
        double retiro;

        System.out.println("Saldo inicial: S/" + saldo);
        System.out.print("Ingrese monto a retirar (0 para salir): ");
        retiro = leer.nextInt();

        while (retiro !=  0) {

            if (retiro <= saldo) {
                saldo = saldo - retiro;
                System.out.println("Retiro exitoso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }


            System.out.println("Saldo actual: S/" + saldo);
            System.out.print("Ingrese monto a retirar (0 para salir): ");
            retiro  = leer.nextInt();
        }

        System.out.println("Saldo restante: S/" + saldo);

        leer.close();
    }
}
