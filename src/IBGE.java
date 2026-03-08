public class IBGE {
    public static void main(String[] args) {
        int A = 0,B = 0,C = 0,D = 0,E = 0,idade = 0,total =0;

        while (true) {
            idade = InOut.leInt("Insira a idade da pessoa ");
            if (idade <= 0) break;

            if (idade >= 1 && idade <= 15) {
                A += 1;
            }
            else if (idade >= 16 && idade <= 30) {
                B += 1;
            }
            else if (idade >= 31 && idade <= 45) {
                C += 1;
            }
            if (idade >= 46 && idade <= 60) {
                D += 1;
            }
            if (idade >= 61 ) {
                E += 1;
            }

         total = A+B+C+D+E;
        }
        System.out.println("Total: "+total);
        System.out.printf("A: %.2f%%\n",((float)A/total)*100);
        System.out.printf("B: %.2f%%\n",((float)B/total)*100);
        System.out.printf("C: %.2f%%\n",((float)C/total)*100);
        System.out.printf("D: %.2f%%\n",((float)D/total)*100);
        System.out.printf("E: %.2f%%\n",((float)E/total)*100);

    }
}
