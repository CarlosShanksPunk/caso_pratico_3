import java.time.LocalDate;
import java.time.Period;

public class DiferencaDatas {

    public static void main(String[] args) {

        LocalDate dataInicio = LocalDate.of(2020, 1, 1); // Data inicial: 01/01/2020
        LocalDate dataAtual = LocalDate.now(); // Data atual

        Period diferenca = Period.between(dataInicio, dataAtual);

        int anos = diferenca.getYears();
        int meses = diferenca.getMonths();
        int dias = diferenca.getDays();

        System.out.println("Diferença entre " + dataInicio + " e " + dataAtual + ":");
        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias");
    }
}
