package br.com.filmesplus.avaliacao.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @JsonIgnore
    @OneToMany(mappedBy = "role")
    private List<Usuario> usuarios;

    public Role() {
    }

    public Role(Long id, String nome, List<Usuario> usuarios) {
        this.id = id;
        this.nome = nome;
        this.usuarios = usuarios;
    }
}
