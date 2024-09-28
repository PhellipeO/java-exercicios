import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        // Passo 1: Leia a idade de uma pessoa.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idadeInserida = sc.nextInt();

        // Passo 2: Verifique se a idade é maior ou igual a 18.
        // Passo 3: Se for, exiba "Maior de idade". Caso contrário, exiba "Menor de
        // idade".
        if (idadeInserida >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }

        sc.close();
    }
}
