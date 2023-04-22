import java.util.Scanner;

public class PuntoUno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine();

        char[] caracteres = frase.toCharArray();

        System.out.println("Los caracteres de la frase son:");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }
    }
}

