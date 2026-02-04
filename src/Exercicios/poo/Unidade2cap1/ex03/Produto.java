package Exercicios.poo.Unidade2cap1.ex03;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public static void main(String[] args) {
        Produto goiaba = new Produto();
        goiaba.setPreco(20);
        goiaba.setQuantidadeEstoque(190);
    }
}
