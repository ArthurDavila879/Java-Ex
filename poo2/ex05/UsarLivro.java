package poo2.ex05;

public class UsarLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("Gelo e fogo","Esqueci o nome","Nao sei",2016,150);
        Livro l2 = new Livro("Diario de um banana","Esqueci ","Nao sei",2013,80);
        Livro l3 = new Livro("Arthur D'Avila","Arthur D'Avila","Meu pai",2025,1000);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        int idade = l1.anosDePublicacao(2026);
        System.out.println("O livro l1 foi publicado a "+idade+" anos");
    }
}
