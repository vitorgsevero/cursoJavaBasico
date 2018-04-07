package aula49;

public class FinallyPegadinha {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] deno = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + deno[i] + " = " + (numeros[i] / deno[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
                System.exit(0); //Termina a execução do programa antes de que o Finally seja executado
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválida");
                System.exit(0);
            } finally {
                System.out.println("Esse comando SEMPRE será executado APÓS o Try ou Catch");
                System.out.println();
            }
        }
    }
}
