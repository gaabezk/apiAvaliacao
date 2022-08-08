package br.com.filmesplus.avaliacao.services;

import br.com.filmesplus.avaliacao.models.Usuario;
import br.com.filmesplus.avaliacao.respositories.UsuarioRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepo repo;

    public UsuarioService(UsuarioRepo repo) {
        this.repo = repo;
    }
    public List<Usuario> listarTodos() {
        return repo.findAll();
    }

    public Usuario salvar(Usuario usuario) {
        return repo.save(usuario);
    }

}
