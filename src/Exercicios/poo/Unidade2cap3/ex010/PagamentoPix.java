package Exercicios.poo.Unidade2cap3.ex010;

public class PagamentoPix extends Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Pix: R$ "+ valor);
    }
}
