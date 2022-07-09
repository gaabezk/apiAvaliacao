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
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nota;
    private String nomeFilme;
    private String idFilme;
    public Avaliacao() {
    }
    public Avaliacao(Long id, String nome, String nota, String nomeFilme, String idFilme) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
        this.nomeFilme = nomeFilme;
        this.idFilme = idFilme;
    }
}
