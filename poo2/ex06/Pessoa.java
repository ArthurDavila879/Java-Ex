package poo2.ex06;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }

    public static String verificarData(int dia, int mes) {
        if (mes < 1 || mes > 12) return "Data Inválida: Mês inexistente.";

        String nomeMes = "";
        int diasNoMes = 31;

        switch (mes) {
            case 1: nomeMes = "Janeiro"; break;
            case 2: nomeMes = "Fevereiro"; diasNoMes = 28; break;
            case 3: nomeMes = "Março"; break;
            case 4: nomeMes = "Abril"; diasNoMes = 30; break;
            case 5: nomeMes = "Maio"; break;
            case 6: nomeMes = "Junho"; diasNoMes = 30; break;
            case 7: nomeMes = "Julho"; break;
            case 8: nomeMes = "Agosto"; break;
            case 9: nomeMes = "Setembro"; diasNoMes = 30; break;
            case 10: nomeMes = "Outubro"; break;
            case 11: nomeMes = "Novembro"; diasNoMes = 30; break;
            case 12: nomeMes = "Dezembro"; break;
        }

        if (dia >= 1 && dia <= diasNoMes) {
            return "Data OK! Mês: " + nomeMes;
        } else {
            return "Data Inválida para o mês de " + nomeMes;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
