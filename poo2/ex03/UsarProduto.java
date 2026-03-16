package poo2.ex03;

public class UsarProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("TV",2000,20);
        Produto p2 = new Produto("Computador",5000,5);
        Produto p3 = new Produto("Celular",3000,15);

        p1.imprimir();
        p1.setPreco(2020);
        p1.setEstoque(10);
        System.out.println(" ");
        p1.imprimir();
        double valorEstoqueP1 = p1.valorEstoque();
        System.out.println("Valor do estoque de TVs: "+ valorEstoqueP1);
        System.out.println("\n\n");

        p2.imprimir();
        p2.setPreco(4050);
        p2.setEstoque(8);
        System.out.println(" ");
        p1.imprimir();
        double valorEstoqueP2 = p2.valorEstoque();
        System.out.println("Valor do estoque de TVs: "+ valorEstoqueP2);
        System.out.println("\n\n");

        p3.imprimir();
        p3.setEstoque(10);
        System.out.println(" ");
        p3.imprimir();
        double valorEstoqueP3= p3.valorEstoque();
        System.out.println("Valor do estoque de TVs: "+ valorEstoqueP3);
    }
}
