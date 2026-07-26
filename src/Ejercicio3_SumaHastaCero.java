import java.util.Scanner;

public class Ejemplo3_SumaHastaCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0;
        do {
            numero = sc.nextInt();
            suma += numero;
        } while (numero != 0);
        System.out.println("Suma total: " + suma);
    }
}