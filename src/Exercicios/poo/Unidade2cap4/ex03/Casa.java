package Exercicios.poo.Unidade2cap4.ex03;
import java.util.ArrayList;

public class Casa {
    ArrayList<Comodo> comodos;

    public Casa() {
        this.comodos = new ArrayList<>();
    }

    public void adicionarComodos(String nomeComodo, double tamanhoComodo){
        comodos.add(new Comodo(nomeComodo, tamanhoComodo));
    }
    public void listarComodos() {
        for(Comodo comodo : comodos){
            System.out.println("- "+ comodo.nome);
            System.out.println("- "+ comodo.tamanho+"m");
        }
    }

    public static void main(String[] args) {
        Casa casa = new Casa();

        casa.adicionarComodos("Banheiro", 2);
        casa.adicionarComodos("Sala", 10);
        casa.adicionarComodos("Quarto", 5);

        casa.listarComodos();
    }
}
