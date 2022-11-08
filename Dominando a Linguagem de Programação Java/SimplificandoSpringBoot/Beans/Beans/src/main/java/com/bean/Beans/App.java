package com.bean.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Livro livro = factory.getBean(Livro.class);
        Autor autor =factory.getBean(Autor.class);
        Livro.setNome("O Hobbit (1937)");
        Livro.setCodigo("1234");
        Autor.setNome("J. R. R. Tolkien");
        Livro.exibir();
    }
}
