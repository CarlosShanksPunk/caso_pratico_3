import java.time.LocalTime;
import java.time.Duration;

public class DiferencaLocalTime {

    public static void main(String[] args) {
        LocalTime horaInicio = LocalTime.of(9, 30, 15);
        LocalTime horaTermino = LocalTime.of(17, 45, 30);

        Duration diferenca = Duration.between(horaInicio, horaTermino);

        long horas = diferenca.toHours();
        long minutos = diferenca.toMinutesPart();
        long segundos = diferenca.toSecondsPart();

        System.out.println("Diferença entre " + horaInicio + " e " + horaTermino + ":");
        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
    }
}
