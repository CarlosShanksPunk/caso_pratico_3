public class AutoboxingUnboxingSoma {

    public static void main(String[] args) {

        int num1 = 10;
        Integer num1Autoboxado = num1;

        int num2 = 25;
        Integer num2Autoboxado = num2;

        int soma = num1Autoboxado + num2Autoboxado;

        int resultado = soma; // Unboxing: obtém o valor primitivo de Integer

        System.out.println("Soma de " + num1 + " e " + num2 + " usando autoboxing e unboxing: " + resultado);
    }
}
