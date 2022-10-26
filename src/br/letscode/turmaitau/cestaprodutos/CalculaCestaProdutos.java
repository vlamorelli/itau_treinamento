package br.letscode.turmaitau.cestaprodutos;

import java.util.Scanner;

public class CalculaCestaProdutos {


    private final static int QTDE_MAXIMA_PRODUTOS = 5;

    Scanner scanner = null;

    RecuperaDadosProduto recuperaDadosProduto = null;

    String[] nomesProdutos;

    Double[] precosProdutos;

    Integer quantidadeProdutos;

    public CalculaCestaProdutos(){

        this.scanner = new Scanner(System.in);
        this.recuperaDadosProduto = new RecuperaDadosProduto(scanner);
        this.nomesProdutos = new String[QTDE_MAXIMA_PRODUTOS];
        this.precosProdutos = new Double[QTDE_MAXIMA_PRODUTOS];
        this.quantidadeProdutos = 0;

    }


    public void recuperarDadosDaCesta(int quantidadeMaxima){

        while (this.quantidadeProdutos < quantidadeMaxima){

            this.nomesProdutos[quantidadeProdutos] = recuperaDadosProduto.recuperarNome();
            this.precosProdutos[quantidadeProdutos] = recuperaDadosProduto.recuperarPreco();

            System.out.println("Digite X para encerrar ou outra letra qualquer para continuar...");
            String letra = scanner.next();
            Boolean sair = letra.equalsIgnoreCase("x");

            if(sair){
                break;
            }else{
                quantidadeProdutos++;
            }
        }

        this.calculaProdutoMaisCaro();
        this.calculaProdutoMaisBarato();

    }

    private void calculaProdutoMaisBarato() {
        int indexProdutoMaisBarato = 0;

        for(int i = 0; i <= this.quantidadeProdutos; i++){
            if(this.precosProdutos[i] < this.precosProdutos[indexProdutoMaisBarato]){
                indexProdutoMaisBarato = i;

            }
        }

        System.out.printf("Produto mais barato: %s - R$ %.2f \n",
                this.nomesProdutos[indexProdutoMaisBarato],
                this.precosProdutos[indexProdutoMaisBarato]);
    }

    private void calculaProdutoMaisCaro() {

        int indexProdutoMaisCaro = 0;

        for(int i = 0; i <= this.quantidadeProdutos; i++){
            if(this.precosProdutos[i] > this.precosProdutos[indexProdutoMaisCaro]){
                indexProdutoMaisCaro = i;

            }
        }

        System.out.printf("Produto mais caro: %s - R$ %.2f \n",
                this.nomesProdutos[indexProdutoMaisCaro],
                this.precosProdutos[indexProdutoMaisCaro]);

    }


}
