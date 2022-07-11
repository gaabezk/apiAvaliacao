package br.com.filmesplus.avaliacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AvaliacaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvaliacaoApplication.class, args);
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;

    }

}
