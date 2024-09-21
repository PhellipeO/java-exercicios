import java.util.Scanner;

public class Somar {
    public static void main(String[] args) {

    // CRIAR OBJETO SCANNER
    Scanner scanner = new Scanner(System.in);
        
    // DECLARAR VARIAVEIS
    System.out.println("Digite o primeiro numero: ");
    int num1 = scanner.nextInt();

    System.out.println("\n");

    System.out.println("Digite o segundo numero: ");
    int num2 = scanner.nextInt();

    // CALCULAR RESULTADO
    int resultado = num1 + num2;

    // IMPRIMIR RESULTADO
    System.out.printf("O resultado é: "+ resultado);

    scanner.close();
    }
}
