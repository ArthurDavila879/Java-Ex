public class SupermercadoMae {
    public static void main(String[] args) {
        float preco;
        char codigo;
        float valorCesta = 0;
        float valorLimpeza = 0;
        float valorAlimento = 0;
        float valorHigiene = 0;

        for (int i = 0; i < 20; i++) {
            preco = InOut.leFloat("Insira o preco do produto");
            valorCesta += preco;

            codigo = InOut.leChar("Insira o tipo de produto Limpeza(L), Alimentacao(A), Higiene(H)");

            switch (codigo) {
                case 'l', 'L':
                    valorLimpeza += preco;
                    break;
                case 'A', 'a':
                    valorAlimento += preco;
                    break;
                case 'H', 'h':
                    valorHigiene += preco;
                    break;

            }

            

        }
        System.out.println("Valor total da Cesta: "+ valorCesta);
            System.out.println("Valor total Limpeza: "+ valorLimpeza);
            System.out.println("Valor total Alimentos: "+ valorAlimento);
            System.out.println("Valor total Higiene: "+ valorHigiene);
            System.out.println("Ola mundo");
    }
}
