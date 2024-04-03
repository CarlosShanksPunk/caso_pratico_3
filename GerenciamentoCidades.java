import java.util.ArrayList;

public class GerenciamentoCidades {

    public static void main(String[] args) {

        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Sao Lourenço dos Orgaos");
        cidades.add("Sao Salvador do Mundo");
        cidades.add("Santa Catarina");
        cidades.add("Sao Miguel");
        cidades.add("Pico de Antonia - Orgaos");

        // Removendo o terceiro item
        cidades.remove(2);

        // Imprimindo as cidades restantes
        System.out.println("Cidades restantes:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
