package poo2.ex01;

public class RH {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(202425214,"Arthur D'Avila","Estagiario",1500f);
        f1.cadastrar();
        f1.consultar();
        System.out.println("Salario atual: "+f1.getSalarioAtual());
        f1.atualizarSalario(2000f);
        System.out.println("Novo salario: "+f1.getSalarioAtual());
        f1.listarDependentes();
    }
}
