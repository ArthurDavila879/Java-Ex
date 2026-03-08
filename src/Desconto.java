public class Desconto {
    public static void main(String[] args) {
        float salario = InOut.leFloat("Insira o salario do funcionario");
        if (salario<0) System.out.println("Salario invalido");
        if (salario<1000) System.out.println("Salario pos desconto: "+salario*0.95);
        else if (salario>=1000 && salario <=2000) System.out.println("Salario pos desconto: "+salario*0.9);
        else if (salario>2000) System.out.println("Salario pos desconto: "+salario*0.85);

        }
    }

