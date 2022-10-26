package br.letscode.turmaitau.cotacao;

import java.util.Scanner;

public class CotacaoMain {

    public static void main(String[] args) {

        String moeda = "Reais";

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe qual é a cotação do Dolar em %s : \n", moeda);
        Double cotacaoDolar = scanner.nextDouble();

        System.out.println("Informe o valor total em Dolar que você quer cotar: ");
        Double valorTotalEmDolar = scanner.nextDouble();

        CalculoCotacao calculoCotacao = new CalculoCotacao(moeda, cotacaoDolar);
        calculoCotacao.calcularCotacaoMoeda(valorTotalEmDolar);

        //teste update repositorio git
        
    }

}
