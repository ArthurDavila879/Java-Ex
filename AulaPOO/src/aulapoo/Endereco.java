
package aulapoo;

public class Endereco {
    public String rua,cep,referencia;
    public int numero;

    public Endereco() {
    }

    public Endereco(String rua, String cep, String referencia, int numero) {
        this.rua = rua;
        this.cep = cep;
        this.referencia = referencia;
        this.numero = numero;
    }
    
    public void imprimir(){
        System.out.println("Rua: " +rua);
        System.out.println("CEP: "+cep);
        System.out.println("Referencia: "+referencia);
        System.out.println("Numero: "+numero);
    }
}
