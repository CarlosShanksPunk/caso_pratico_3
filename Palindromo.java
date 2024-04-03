import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = sc.nextLine().toLowerCase(); // Ignora maiúsculas e minúsculas

        String inverso = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            inverso += texto.charAt(i);
        }

        if (texto.equals(inverso)) {
            System.out.println(texto + " é um palíndromo!");
        } else {
            System.out.println(texto + " não é um palíndromo.");
        }
    }
}
