package br.com.filmesplus.avaliacao.respositories;

import br.com.filmesplus.avaliacao.models.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepo extends JpaRepository<Avaliacao, Long> {
}
