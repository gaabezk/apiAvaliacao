package br.com.filmesplus.avaliacao.respositories;

import br.com.filmesplus.avaliacao.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Optional<Role> findByNome(String nome);

}
