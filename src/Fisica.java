public class Fisica {
    public static void main(String[] args) {
        float tempo = InOut.leFloat("Insira o tempo gasto em horas durante a viagem ");
        float vMedia = InOut.leFloat("Insira a velocidade media em km/h ");
        float distancia = tempo * vMedia;
        float litros = InOut.leFloat("Insira a quantidade de litros gastos ");
        float consumo = distancia / litros;
        System.out.println("Distancia: " + distancia + "km");
        System.out.println("Consumo: " + consumo + "L");
    }
}
