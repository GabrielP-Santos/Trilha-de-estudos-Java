package Exercicios.poo.Unidade2cap4.ex05;

public class Usuario implements Autenticavel{
    String cpf;
    @Override
    public void autenticar(String senha) {
        System.out.println("Digite o seu cpf: ");
        if (senha.equals(cpf)){
            System.out.println("Login feito!");
        } else {
            System.out.println("Tente novamente");
        }
    }
}