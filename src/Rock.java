public class Rock {
    public static void main(String[] args) {
        int idade = InOut.leInt("Insira sua idade");
        char sexo = InOut.leChar("Insira seu sexo (M/F)");
        if (idade >=18 && (sexo == 'M'|| sexo == 'm')){
            System.out.println("Liberado, homem de maior");
        }
        else if (idade >=21 && (sexo =='F'||sexo=='f')){
            System.out.println("Liberado, mulher de maior");
        }
        else{
            System.out.println("Barrado,de menor");
        }

    }
}
