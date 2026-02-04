package Exercicios.poo.Unidade2cap3.ex07;

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Animal[] animal = new Animal[]{cachorro, gato};

        for(Animal animais : animal){
            animais.fazerSom();
        }

    }
}
