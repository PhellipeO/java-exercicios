import java.util.Scanner;

public class CelsiusToFh {
    public static void main(String[] args) {

        // Passo 1: Leia a temperatura em graus Celsius.
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é sua temperatura em Celsius agora? ");
        double GrausAtual = sc.nextDouble();

        // Passo 2: Aplique a fórmula de conversão para Fahrenheit (F = C * 9/5 + 32).
        double Conversor = GrausAtual * 9/5 + 32;


        // Passo 3: Exiba a temperatura convertida em Fahrenheit.
        System.out.println("A temperatura em Fahrenheit é: " + Conversor);
    
    sc.close();
    }

}
