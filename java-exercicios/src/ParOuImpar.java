import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

    // Passo 1: Leia um número do teclado.
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    int receberNumero = sc.nextInt();

    // Passo 2: Verifique se o número é divisível por 2.
    // Passo 3: Se for divisível, exiba "Par". Caso contrário, exiba "Ímpar".
    if (receberNumero % 2 == 0) {
        System.out.println("Numero é par");
    } else {
        System.out.println("Numero é impar");
    }

    sc.close();

    }
}
