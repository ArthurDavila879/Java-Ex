package imc;

import java.util.Scanner;
public class IMC {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
    
            float peso = InOut.leFloat("Insira seu peso");
            float altura = InOut.leFloat("Insira sua altura");
            float imc = peso / (altura * altura);

            if (peso < 0 || altura < 0) {
                System.out.println("Valores invalidos");
                break;
            }

            System.out.printf("IMC: %.2f\n",imc);

            if (imc < 18.5) {
                System.out.println("Abaixo do peso");
                break;

            } else if (imc >= 18.5 && 25 > imc) {
                System.out.println("Normal");
                break;

            } else {
                System.out.println("Acima do peso");
                break;

            }
        }
    }

}
