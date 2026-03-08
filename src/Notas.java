public class Notas {
    public static void main(String[] args) {

        float n1 = InOut.leFloat("Insira a primeira nota ");
        float n2 = InOut.leFloat("Insira a segunda nota ");
        float n3 = InOut.leFloat("Insira a terceira nota ");
        float media = (n1 + n2 + n3) / 3;

        if (n1 < 0 || n2 < 0 || n3 < 0 || media < 0 ||n1 >10 || n2 >10 || n3 >10 || media >10) {
            System.out.println("Valores inválidos");
        } else {
            if (media >= 4 && media < 7) {
                System.out.printf("Recuperação, faltam %.2f para passar", 10 - media);
            } else if (media < 4) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Aprovado");
            }
        }
    }
}
