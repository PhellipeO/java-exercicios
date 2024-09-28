import java.util.Scanner;

public class MediaTresNumeros {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    // Passo 1: Leia três números do teclado.
    System.out.println("Digite primeiro numero da média: ");
    double numeroUm = sc.nextDouble();
    
    System.out.println("Digite primeiro segundo da média: ");
    double numeroDois = sc.nextDouble();
    
    System.out.println("Digite primeiro terceiro da média: ");
    double numeroTres = sc.nextDouble();

    // Passo 2: Some os três números.
    double SomaDosTres = numeroUm + numeroDois + numeroTres;

    // Passo 3: Divida a soma por 3 para obter a média.
    double CalculoMedia = SomaDosTres / 3;
    
    // Passo 4: Exiba a média no console.
    System.out.println("A média é: " + CalculoMedia);

    sc.close();
    }
}
