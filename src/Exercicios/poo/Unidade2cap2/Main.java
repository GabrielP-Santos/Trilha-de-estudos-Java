package Exercicios.poo.Unidade2cap2;

import Exercicios.poo.Unidade2cap2.ex04.Engenheiro;

public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("Gabriel", "Lider de projetos", 5000);
        engenheiro.falarNome();
        engenheiro.falarCargo();
        engenheiro.falarSalario();
    }
}
