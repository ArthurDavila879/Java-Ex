public class Satisfacao {
    public static void main(String[] args) {
            int mix1 = 0;
            int mix2 = 0;
            int mix3 = 0;
            int totalVotos = 0;

            int opcao;
            InOut.MsgSemIcone("Opcao", "Escolha uma opcao");


            do {
                opcao = InOut.leInt("1: Mix 1\n2: Mix 2\n3: Mix 3\n0: Encerrar Votação");
                switch (opcao) {

                    case 1:
                        mix1++;
                        totalVotos++;
                        break;
                    case 2:
                        mix2++;
                        totalVotos++;
                        break;
                    case 3:
                        mix3++;
                        totalVotos++;
                        break;
                    case 0:
                        System.out.println("Encerrando entrada de dados...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } while (opcao != 0);


            if (totalVotos > 0) {
                double perc1 = ((double) mix1 / totalVotos) * 100;
                double perc2 = ((double) mix2 / totalVotos) * 100;
                double perc3 = ((double) mix3 / totalVotos) * 100;


                System.out.println("Total de participantes: " + totalVotos);
                System.out.printf("Mix 1: %.2f%%\n", perc1);
                System.out.printf("Mix 2: %.2f%%\n", perc2);
                System.out.printf("Mix 3: %.2f%%\n", perc3);
            } else {
                System.out.println("\nNenhum voto foi registrado.");
            }

        }
        }


