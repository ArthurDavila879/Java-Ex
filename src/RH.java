public class RH {
    public static void main(String[] args) {
        float valorHora = InOut.leFloat("Insira o valor da aula por hora");
        float aulas = InOut.leFloat("Insira a quantidade de aulas em horas");
        float inss = InOut.leFloat("Insira a porcentagem do INSS");
        float salarioBruto = (aulas*valorHora);
        float salarioLiquido = salarioBruto-(salarioBruto*inss);
        System.out.println("Salario liquido: "+salarioLiquido);
    }
}
