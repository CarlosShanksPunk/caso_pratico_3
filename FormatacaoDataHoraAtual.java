import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatacaoDataHoraAtual {

    public static void main(String[] args) {

        LocalDateTime dataHoraAtual = LocalDateTime.now();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dataHoraFormatada = dataHoraAtual.format(formatador);

        System.out.println("Data e hora atual formatada: " + dataHoraFormatada);
    }
}
