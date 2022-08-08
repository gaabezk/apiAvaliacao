package br.com.filmesplus.avaliacao.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nota;
    private String nomeFilme;
    private String idFilme;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Avaliacao() {
    }
    public Avaliacao(Long id, String nota, String nomeFilme, String idFilme, Usuario usuario) {
        this.id = id;
        this.nota = nota;
        this.nomeFilme = nomeFilme;
        this.idFilme = idFilme;
        this.usuario = usuario;
    }
}
