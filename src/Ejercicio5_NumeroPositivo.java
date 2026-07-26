import java.util.Scanner;

public class Ejemplo5_NumeroPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingresa un número positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);
    }
}