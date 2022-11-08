package com.inversaoControle;

public class Pedido {
    public static void main(String[] args) {
    Pedido pedido = new Pedido();
    pedido.gravar();
    }
    //classe dedicada a inversão de controle
    private final EnviarEmail enviar = EnviarEmail.obterDadosEviarEmail();
    public void gravar(){
        this.enviar.retornar("Pedido Criado! ");
    }
}
