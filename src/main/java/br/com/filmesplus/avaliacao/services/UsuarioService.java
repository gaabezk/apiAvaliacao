package br.com.filmesplus.avaliacao.services;

import br.com.filmesplus.avaliacao.models.Usuario;
import br.com.filmesplus.avaliacao.respositories.UsuarioRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepo repo;
    private final PasswordEncoder encoder;


    public UsuarioService(UsuarioRepo repo, PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    public List<Usuario> listarTodos() {
        return repo.findAll();
    }

    public Usuario salvar(Usuario usuario) {
        usuario.setPassword(encoder.encode(usuario.getPassword()));
        return repo.save(usuario);
    }

    public boolean validarSenha(String username, String password) {
        Optional<Usuario> optionalUsuario = repo.findByUsername(username);
        if (optionalUsuario.isEmpty()) {
            return false;
        }
        Usuario usuario = optionalUsuario.get();
        boolean valid = encoder.matches(password, usuario.getPassword());
        return valid;
    }
}
