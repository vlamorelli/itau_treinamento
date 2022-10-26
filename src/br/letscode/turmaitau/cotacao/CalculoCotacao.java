package br.letscode.turmaitau.cotacao;

public class CalculoCotacao {

    private static String moeda;
    private static Double cotacaoHoje;

    public CalculoCotacao(String moeda, double cotacaoHoje){

        this.moeda = moeda;
        this.cotacaoHoje = cotacaoHoje;

    }

    public static void calcularCotacaoMoeda(double valorTotalEmDolares){
        Double valorTotalConvertido = cotacaoHoje;
        System.out.printf("Valor total convertido é de %.2f %s ", (valorTotalEmDolares*cotacaoHoje), moeda);
    }

}
