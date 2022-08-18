package br.com.filmesplus.avaliacao.configs.security;

import br.com.filmesplus.avaliacao.models.Usuario;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Getter
public class UsuarioDetalhe implements UserDetails {

    private Optional<Usuario> usuario;

    private String colecao;

    public UsuarioDetalhe(Optional<Usuario> usuario, String colecao) {
        this.usuario = usuario;
        this.colecao = colecao;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(usuario.get().getRole().getNome()));
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return usuario.get().getSenha();
    }

    @Override
    public String getUsername() {
        return usuario.get().getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
