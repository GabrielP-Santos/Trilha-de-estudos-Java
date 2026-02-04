package Exercicios.poo.Unidade2cap3.ex010;

public class PagamentoCartao extends Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito: R$ "+ valor);
    }
}
