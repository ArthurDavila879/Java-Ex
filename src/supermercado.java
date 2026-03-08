public class supermercado {
    public static void main(String[] args) {
        float valorCompra = InOut.leFloat("Insira o valor da compra");
        float valorVenda = 0f;
        if (valorCompra<20){
            valorVenda = valorCompra*1.45f;
        }
        else{
            valorVenda = valorCompra*1.30f;
        }
        InOut.MsgDeInformacao("Valor","Valor da venda: "+valorVenda);

    }
}
