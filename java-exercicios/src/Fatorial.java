import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // Passo 1: Leia um número inteiro.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        // Passo 2: Inicialize uma variável para armazenar o fatorial (comece com 1).
        int fatorial = 1;        

        // Passo 3: Use um laço para multiplicar os números até o valor do número lido.
        for(int i = 1; i <= numero; i++){
            fatorial *= i; // Multiplica fatorial pelo número atual
        }
        
        // Passo 4: Exiba o resultado do fatorial
        System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
        
        sc.close();
    }
}
