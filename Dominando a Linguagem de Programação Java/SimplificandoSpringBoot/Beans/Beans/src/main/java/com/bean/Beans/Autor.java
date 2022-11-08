package com.bean.Beans;

public class Autor implements AutorLivro{
    private String nome;
    public String getNome() {
        return nome;
    }
    public static void setNome(String nome) {
    }
    public void exibirNome(){
        System.out.println(this.getNome());

    }
    public void exibirAutor() {
        System.out.println(this.getNome());
    }
}
