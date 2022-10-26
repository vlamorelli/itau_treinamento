package br.letscode.turmaitau.cestaprodutos;

import java.util.Scanner;

public class RecuperaDadosProduto {

    public Scanner scanner;

    public RecuperaDadosProduto(Scanner scanner){
        this.scanner = scanner;
    }

    public String recuperarNome(){
        System.out.println("Digite o nome de um produto: ");
        String nome = scanner.next();
        return nome;
    }

    public Double recuperarPreco(){
        System.out.println("Digite o preço desse produto: ");
        Double preco = scanner.nextDouble();
        return preco;
    }

}
