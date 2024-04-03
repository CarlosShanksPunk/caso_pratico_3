import java.util.ArrayList;
public class CopiarArrayParaArrayList {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int numero : numeros) {
            listaNumeros.add(numero);
        }

        System.out.println("Elementos do ArrayList:");
        for (int numero : listaNumeros) {
            System.out.print(numero + " ");
        }
    }
}
