package client;

import java.util.Scanner;

public class Biblioteca {

    Scanner leitor = new Scanner(System.in);

    public void adicionarLivro() {
        String idLivro = "Default";

        System.out.println("Digite o título: ");
        String titulo = leitor.nextLine();

        System.out.println("Digite o autor: ");
        String autor = leitor.nextLine();

        System.out.println("Digite o ano de publicação: ");
        Integer anoPublicacao = leitor.nextInt();

        Livro livro = new Livro(idLivro, titulo, autor, anoPublicacao);


    }
}
