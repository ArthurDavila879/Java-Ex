package poo2.ex06;

import java.util.Scanner;

public class UsarPessoa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa[] pessoas =new Pessoa[5];

        int maiorIdade=0,menorIdade=1000,somaIdades=0,qtdMaiorDeIdade=0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Insira seu nome");
            String nome = teclado.nextLine();

            System.out.println("Insira sua idade");
            int idade = teclado.nextInt();
            teclado.nextLine();
            if (idade>=18)qtdMaiorDeIdade+=1;
            if (idade >maiorIdade)maiorIdade = idade;
            if (idade<menorIdade)menorIdade = idade;
            somaIdades+=idade;

            pessoas[i] = new Pessoa();
            pessoas[i].setNome(nome);
            pessoas[i].setIdade(idade);

        }
        for( Pessoa p :pessoas){
            System.out.println(" ");
            p.imprimir();

        }
        System.out.println(" ");
        System.out.println("Media das idades: "+somaIdades/5);
        System.out.println("Maior idade: "+maiorIdade);
        System.out.println("Menor idade: "+menorIdade);
        System.out.println("Quantidade de maiores de idade: "+qtdMaiorDeIdade);


        System.out.println("Verificação de Aniversário");
        System.out.print("Digite o dia: ");
        int dia = teclado.nextInt();
        System.out.print("Digite o mês (número): ");
        int mes = teclado.nextInt();

        System.out.println(Pessoa.verificarData(dia, mes));

        teclado.close();
    }
}
