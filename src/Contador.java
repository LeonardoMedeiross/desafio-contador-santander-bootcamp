
import parametrosInvalidos.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        //Instanciação do Scanner
        Scanner terminal = new Scanner(System.in);

        // Leitura dos parâmetros:
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        //Chamada do método contar com tratamento de exceção

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception){
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        //Tenta chamar o método contar com os dois parâmetros. Se uma exceção do tipo ParametrosInvalidosException for lançada, imprime uma mensagem de erro.

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
       //Validação dos parâmetros
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        //Calcula a diferença entre parametroDois e parametroUm, que determina quantas vezes o laço for será executado
        int contagem = parametroDois - parametroUm;

        //Executa um laço que imprime os números de 1 até contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i );
        }
    }
}