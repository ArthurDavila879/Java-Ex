public class Contas {
    public static void main(String[] args) {
        int n1,n2,escolha = 0;
        while (true){
        escolha = InOut.leInt("[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Finalizar\n");
        if (escolha == 5)break;

        n1 = InOut.leInt("Insira o numero 1");
        n2 = InOut.leInt("Insira o numero 2");

        switch (escolha) {
            case 1:
                System.out.println("n1+n2 = "+ (n1 + n2));
                break;

            case 2:
                System.out.println("n1-n2 = "+ (n1 - n2));
                break;
            case 3:
                System.out.println("n1*n2 = "+ (n1 * n2));
                break;
            case 4 :
                System.out.println("n1/n2 = "+ (n1 / n2));
                break;
            default:

        }
    }
    }

}
