package br.letscode.turmaitau.cestaprodutos;

public class CestaProdutosMain {

    private final static int QTDE_MAXIMA_PRODUTOS = 5;

    public static void main(String[] args) {
        CalculaCestaProdutos calculaCestaProdutos = new CalculaCestaProdutos();
        calculaCestaProdutos.recuperarDadosDaCesta(QTDE_MAXIMA_PRODUTOS);
    }

}
