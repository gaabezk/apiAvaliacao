package br.com.filmesplus.avaliacao.services;

import br.com.filmesplus.avaliacao.data.DetalheUsuarioData;
import br.com.filmesplus.avaliacao.models.Usuario;
import br.com.filmesplus.avaliacao.respositories.UsuarioRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DetalheUsuarioServiceImpl implements UserDetailsService {

    private final UsuarioRepo repo;

    public DetalheUsuarioServiceImpl(UsuarioRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<Usuario> usuario = repo.findByUsername(username);
        if (usuario.isEmpty()) {
            throw new UsernameNotFoundException("Usuário [" + username + "] não encontrado");
        }
        return new DetalheUsuarioData(usuario);
    }
}
