package br.org.jprojects.desafiodesignpatternsspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioDesignPatternsSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesafioDesignPatternsSpringApplication.class, args);
    }

}
