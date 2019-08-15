package A01_introducao_sintaxe.exemplos;

import java.util.Scanner;

public class ExTratamentoErro {

    public static void main(String args[]) {
        int i;
        double d, soma;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um inteiro: ");
        i = s.nextInt();
        System.out.println("Digite um real: ");
        d = s.nextDouble();
        soma = i + d;
        System.out.printf("Resultado: %.3f", soma);
    }
}
