import java.util.Scanner;

public class adivinanumero {

    public static void main(String[] args) {
        int numeroSecreto = 15;
        int numeroUsuario = 0; 
        Scanner teclado = new Scanner(System.in);

        while (numeroUsuario != numeroSecreto) {
            System.out.print("Ingrese un número: ");
            numeroUsuario = teclado.nextInt();
            if (numeroUsuario != numeroSecreto) {
                System.out.println("Incorrecto\n");
            }
        }

        System.out.println("¡Correcto!");
    }
}