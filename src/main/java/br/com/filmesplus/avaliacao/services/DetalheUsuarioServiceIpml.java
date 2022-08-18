package br.com.filmesplus.avaliacao.services;

import br.com.filmesplus.avaliacao.configs.security.UsuarioDetalhe;
import br.com.filmesplus.avaliacao.models.Usuario;
import br.com.filmesplus.avaliacao.respositories.UsuarioRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DetalheUsuarioServiceIpml implements UserDetailsService {

    private final UsuarioRepo repo;

    public DetalheUsuarioServiceIpml(UsuarioRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> usuario = repo.findByEmail(username);
        if (usuario.isEmpty()) {
            throw new UsernameNotFoundException("Email " + username + " Não encontrado");
        }

        return new UsuarioDetalhe(usuario,String.format("%s-%s-%s-%s",usuario.get().getId(), usuario.get().getNome(), usuario.get().getEmail(), usuario.get().getRole().getNome()));

    }
}
