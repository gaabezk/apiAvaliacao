package br.com.filmesplus.avaliacao.respositories;

import br.com.filmesplus.avaliacao.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepo extends JpaRepository<Usuario,Long> {

    public Optional<Usuario> findByEmail(String email);

}
