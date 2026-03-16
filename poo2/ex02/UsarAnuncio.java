package poo2.ex02;

public class UsarAnuncio {
    public static void main(String[] args) {
        Anuncio a1 = new Anuncio(1,"ola mundo","20-30/04/2026",1200f,"Teste01","20/04/2026",10,"UVV","27996564567","Sem observacao");
       a1.remeterViaEmail();
       a1.manter();
       a1.anunciar();
       String x = a1.localizar();
        System.out.println(x);
    }
}
