/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo;

public class Empregado {
    public String nome;
    public int matricula;
    public float salario;
    public Endereco end;
    
    public Empregado(){
        
    }

    public Empregado(String nome, int matricula, float salario, Endereco end) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.end = end;
    }
    
    public void imprimir(){
        System.out.println("-----DADOS DO EMPREGADO-----");
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Salario: "+salario);
        end.imprimir();
    }    
}
