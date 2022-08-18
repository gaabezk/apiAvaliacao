package br.com.filmesplus.avaliacao.services;

import br.com.filmesplus.avaliacao.models.Usuario;
import br.com.filmesplus.avaliacao.respositories.UsuarioRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final PasswordEncoder encoder;
    private final UsuarioRepo repo;

    public UsuarioService(PasswordEncoder encoder, UsuarioRepo repo) {
        this.encoder = encoder;
        this.repo = repo;
    }

    public List<Usuario> listarTodos() {
        return repo.findAll();
    }

    public Usuario salvar(Usuario usuario) {
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        return repo.save(usuario);
    }

    public Usuario cadastro(Usuario usuario) {
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        return repo.save(usuario);
    }

}
