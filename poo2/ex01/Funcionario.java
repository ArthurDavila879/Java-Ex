package poo2.ex01;

public class Funcionario {
    private int matricula;
    private String nome;
    private String cargoAtual;
    private float salarioAtual;

    public Funcionario(){

    }

    public Funcionario(int matricula, String nome, String cargoAtual, float salarioAtual) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargoAtual = cargoAtual;
        this.salarioAtual = salarioAtual;
    }
    public void cadastrar(){
        System.out.println("Cadastrando funcionario");
    }
    public void consultar(){
        System.out.println("Consultando funcionario");
    }
    public void atualizarSalario(float novoSalario){
        salarioAtual = novoSalario;
    }
    public void listarDependentes(){
        System.out.println("Funcionario nao tem dependentes");
    }

    public float getSalarioAtual() {
        return salarioAtual;
    }

}
