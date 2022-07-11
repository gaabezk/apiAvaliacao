package br.com.filmesplus.avaliacao.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String username;
    @Column(name = "senha")
    private String password;

    public Usuario(String nome, String email, String username, String password) {
        this.nome = nome;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Usuario() {
    }
}
