package br.letscode.turmaitau.gastocombustivel;

import java.util.Scanner;

public class CalculoCombustivelMain {

    private final static int quilometrosPorLitro = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tempo gasto na viagem em horas: ");
        Double tempoGasto = scanner.nextDouble();

        System.out.println("Informe a velocidade média: ");
        Double velocidadeMedia = scanner.nextDouble();


        Double distancia = calculaDistancia(tempoGasto, velocidadeMedia);

        Double quantidadeLitroUtilizada = calculaQuantidadeLitrosUtilizada(distancia, quilometrosPorLitro);

        System.out.printf("Velocidade média ( %.0f ),\nTempo gasto ( %.0f horas ),\n" +
                "Distância percorrida ( %s KM ),\nQuantidade de liros utilizados ( %.2f )",
                velocidadeMedia, tempoGasto, distancia, quantidadeLitroUtilizada);

    }

    private static Double calculaQuantidadeLitrosUtilizada(Double distancia, int quilometrosPorLitro) {
        return (distancia/quilometrosPorLitro);
    }

    public static Double calculaDistancia(Double tempoGasto, Double velocidadeMedia){

        return (tempoGasto * velocidadeMedia);

    }
}
