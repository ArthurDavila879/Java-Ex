package poo2.ex04;

public class UsarBaratas {
    public static void main(String[] args) {
        PopulacaoBaratas p1 = new PopulacaoBaratas();
        System.out.println("Populacao inicial: "+ p1.getQtdBaratas());
        p1.aumentarBaratas();
        System.out.println("Populacao atual: "+p1.getQtdBaratas());
        p1.sprayPulvarizador();
        System.out.println("Populacao apos spray: "+p1.getQtdBaratas());
    }
}
