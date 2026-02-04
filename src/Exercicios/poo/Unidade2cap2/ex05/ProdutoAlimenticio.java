package Exercicios.poo.Unidade2cap2.ex05;

import java.time.LocalDate;

public class ProdutoAlimenticio extends Produto {
    LocalDate dataValidade = LocalDate.of(2026,1,1);

    public boolean estaVencido(){
        return !dataValidade.isBefore(LocalDate.now());
    }
}
