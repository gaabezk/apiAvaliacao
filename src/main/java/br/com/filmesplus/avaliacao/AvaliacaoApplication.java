package br.com.filmesplus.avaliacao;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "AvaliaçãoPlus - Api",
                version = "v1",
                description = "SpringBoot Web Api",
                contact = @io.swagger.v3.oas.annotations.info.Contact(
                        name = "Gabriel Fernandes",
                        email = "gabriel1521@outlook.com",
                        url = "https://github.com/gaabezk"
                )
        )
)
public class AvaliacaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AvaliacaoApplication.class, args);
    }

}
