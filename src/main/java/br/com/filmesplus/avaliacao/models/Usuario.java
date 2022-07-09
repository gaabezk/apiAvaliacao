package br.com.filmesplus.avaliacao.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String token;

    public Usuario(Long id, String nome, String email, String senha, String token) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.token = token;
    }

    public Usuario(String nome, String email, String senha, String token) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.token = token;
    }

    public Usuario() {
    }
}
