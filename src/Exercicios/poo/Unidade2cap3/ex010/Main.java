package Exercicios.poo.Unidade2cap3.ex010;

public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new PagamentoCartao();
        Pagamento p2 = new PagamentoPix();

        Pagamento[] listaPag = new Pagamento[]{p1, p2};

        for(Pagamento lista : listaPag){
            lista.processarPagamento(20);
        }
    }
}
