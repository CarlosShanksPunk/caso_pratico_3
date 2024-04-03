import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class IdadeMedia {

    public static void main(String[] args) {

        List<LocalDate> datasNascimento = new ArrayList<>();
        datasNascimento.add(LocalDate.of(1980, 1, 1));
        datasNascimento.add(LocalDate.of(1990, 7, 12));
        datasNascimento.add(LocalDate.of(2000, 3, 31));

        List<Integer> idades = new ArrayList<>();
        for (LocalDate dataNascimento : datasNascimento) {
            LocalDate dataAtual = LocalDate.now();
            Period diferenca = Period.between(dataNascimento, dataAtual);
            idades.add(diferenca.getYears());
        }

        int somaIdades = 0;
        for (int idade : idades) {
            somaIdades += idade;
        }
        double idadeMedia = (double) somaIdades / idades.size();

        System.out.println("Idade média das pessoas: " + idadeMedia + " anos");
    }
}
