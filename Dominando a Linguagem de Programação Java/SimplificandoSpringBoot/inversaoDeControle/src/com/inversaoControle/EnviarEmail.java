package com.inversaoControle;

public class EnviarEmail {
    public EnviarEmail(String tipo, String endereco, String senha){
    }
    public static EnviarEmail obterDadosEviarEmail(){
        return new EnviarEmail("Email", "germano@gmail.com", "123");
    }
    public void retornar(String mensagem){
        System.out.println("Email enviado! ");
    }
}
