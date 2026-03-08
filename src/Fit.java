//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
public class Fit {
    public static void main(String[] args) {
        float altura = InOut.leFloat("Insira sua altura em metro");
        char sexo = InOut.leChar("Insira seu sexo (M/F)");
        if (sexo == 'M') {
            System.out.printf("Seu peso ideal: %.2f\n", 72.7 * (double)altura - (double)58.0F);
        }

        if (sexo == 'F') {
            System.out.printf("Seu peso ideal: %.2f\n", 62.1 * (double)altura - 44.7);
        }

    }
}
