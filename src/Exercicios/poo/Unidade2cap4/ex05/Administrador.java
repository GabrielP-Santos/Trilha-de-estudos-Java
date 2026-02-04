package Exercicios.poo.Unidade2cap4.ex05;

public class Administrador implements Autenticavel{
    String codigo;
    @Override
    public void autenticar(String senha) {
        System.out.println("Digite seu código de autenticação");
        if (senha.equals(codigo)){
            System.out.println("Login feito!");
        } else {
            System.out.println("Tente novamente");
        }
    }
}
