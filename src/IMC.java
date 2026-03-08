
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        new Scanner(System.in);
        float peso = InOut.leFloat("Insira seu peso");
        float altura = InOut.leFloat("Insira sua altura");
        float imc = peso / (altura * altura);
        if (!(peso < 0.0F) && !(altura < 0.0F)) {
            System.out.printf("IMC: %.2f\n", imc);
            if ((double)imc < (double)18.5F) {
                System.out.println("Abaixo do peso");
            } else if ((double)imc >= (double)18.5F && 25.0F > imc) {
                System.out.println("Normal");
            } else {
                System.out.println("Acima do peso");
            }
        } else {
            System.out.println("Valores invalidos");
        }

    }
}
