package com.bean.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * A anotação @Configuration diz ao Spring que esta classe contém um ou mais métodos @Bean e pode ser processada por
 * o contêiner Spring para gerar definições de bean e solicitações de serviço para esses beans em tempo de execução.
 */

@Configuration
public class AppConfig {
    @Bean
    public Livro getLivro(){
        return new Livro();
    }
//  <bean id="Livro" class="com.bean.Beans.Livro"/> versão em XML.
    @Bean
    public AutorLivro getAutorLivro(){
        return new Autor();
    }
}
