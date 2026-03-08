import java.time.LocalDate;

public class Utilidade {
    public static void main(String[] args) {
        int dataNascimento = InOut.leInt("Insira seu ano de nascimento");
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - dataNascimento;
       if (idade >=16){
           System.out.println("Pode votar");
           if (idade>18){
               System.out.println("Pode tirar CNH");
           }
       }
       else{
           System.out.println("Pode fazer nada");
       }

    }
}
