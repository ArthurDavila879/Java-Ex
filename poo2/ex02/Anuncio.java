package poo2.ex02;

public class Anuncio {
    private int id;
    private String palavras;
    private String diasPublicacao;
    private float valor;
    private String titulo;
    private String dataInsercao;
    private int publicar;
    private String nomeContato;
    private String telefone;
    private String observacao;

    public Anuncio(){

    }
    public Anuncio(int id, String palavras, String diasPublicacao, float valor, String titulo, String dataInsercao, int publicar, String nomeContato, String telefone, String observacao) {
        this.id = id;
        this.palavras = palavras;
        this.diasPublicacao = diasPublicacao;
        this.valor = valor;
        this.titulo = titulo;
        this.dataInsercao = dataInsercao;
        this.publicar = publicar;
        this.nomeContato = nomeContato;
        this.telefone = telefone;
        this.observacao = observacao;
    }

    public void remeterViaEmail(){
        System.out.println("Remetendo via Email");
    }
    public void manter(){
        System.out.println("Mantendo anuncio");
    }
    public void anunciar(){
        System.out.println("Anunciando");
    }
    public String localizar(){
        System.out.println("Localizando palavra");
        return palavras;
    }
}
