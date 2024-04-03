import java.time.*;
import java.time.format.DateTimeFormatter;

public class ConversaoFusoHorario {

    public static void main(String[] args) {

        ZoneId caboVerde = ZoneId.of("Atlantic/Cape_Verde");
        LocalDateTime dataHoraCaboVerde = LocalDateTime.now(caboVerde);

        DateTimeFormatter formatadorCaboVerde = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraCaboVerdeFormatada = dataHoraCaboVerde.format(formatadorCaboVerde);

        ZoneId toquio = ZoneId.of("Asia/Tokyo");
        ZonedDateTime dataHoraTokio = dataHoraCaboVerde.atZone(caboVerde).withZoneSameInstant(toquio);

        DateTimeFormatter formatadorTokio = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraTokioFormatada = dataHoraTokio.format(formatadorTokio);

        System.out.println("Data e hora atual em Cabo Verde (Atlantic/Cape_Verde): " + dataHoraCaboVerdeFormatada);
        System.out.println("Data e hora convertida para Tóquio (Asia/Tokyo): " + dataHoraTokioFormatada);
    }
}
