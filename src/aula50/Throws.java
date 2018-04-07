package aula50;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Throws {
    public static void main(String[] args) {
        
        System.out.println("Informe um valor decimal:");
        try {
            double num = leNumero();
            System.out.println("Valor informado: " + num);
        } catch (Exception ex) {
            System.out.println("Entrada inválida");
            ex.printStackTrace();
        }
    }
    
    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
    
}
