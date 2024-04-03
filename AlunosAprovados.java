import java.util.ArrayList;
import java.util.Scanner;

public class AlunosAprovados {

    public static void main(String[] args) {

        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Double> notasFinais = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de alunos: ");
        int numeroAlunos = scanner.nextInt();

        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            String nomeAluno = scanner.next();
            nomesAlunos.add(nomeAluno);

            System.out.println("Digite a nota final do aluno " + nomeAluno + ": ");
            double notaFinal = scanner.nextDouble();
            notasFinais.add(notaFinal);
        }

        System.out.println("\nAlunos Aprovados:");
        for (int i = 0; i < nomesAlunos.size(); i++) {
            double notaFinal = notasFinais.get(i);
            if (notaFinal >= 7.0) {
                System.out.println(nomesAlunos.get(i));
            }
        }
    }
}