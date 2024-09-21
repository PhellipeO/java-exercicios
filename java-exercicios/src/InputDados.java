// Como importar a classe Scanner
import java.util.Scanner;

public class InputDados {
    public static void main(String[] args) {
    // Entrada de DADOS - input
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite algum numero: ");

    int numeroDigitado = sc.nextInt();

    System.out.println("O numero Digitado é: "+ numeroDigitado);


    }

}
