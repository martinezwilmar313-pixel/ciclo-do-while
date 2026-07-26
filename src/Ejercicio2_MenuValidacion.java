import java.util.Scanner;

public class Ejemplo2_MenuValidacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Iniciar\n2. Salir");
            opcion = sc.nextInt();
        } while (opcion != 1 && opcion != 2);
    }
}