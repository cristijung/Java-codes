package tipagem.pratica;
//Desenvolver um algoritmo em Java que exiba as seguintes informações,
// do usuário (por meio do Scanner).
//EXEMPLO: Olá, seu nome é João, você tem 16 anos, é da cidade de
// Porto Alegre, situada no estado Rio Grande do Sul..

import java.util.Scanner;

public class PraticaUm {
    public static void main(String[] args) {
        //criação do scanner para capturar a entrada do user e está atribuída o nome 'ler'
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor digite o seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine();


        System.out.println("Digite a sua cidade natal: ");
        String cidade = ler.nextLine();

        System.out.println("Olá, seu nome é: " + nome + " você tem " + idade + " e nasceu em " + cidade + ".");

        ler.close(); //finaliza o scanner, mas não é determinante

    }


}
