package aula49;

public class Finally {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] deno = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + deno[i] + " = " + (numeros[i] / deno[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválida");
            }
            finally {
                System.out.println("Esse comando SEMPRE será executado APÓS o Try ou Catch");
            }
        }
    }
}
