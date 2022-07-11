package br.com.filmesplus.avaliacao.services;

import br.com.filmesplus.avaliacao.models.Avaliacao;
import br.com.filmesplus.avaliacao.respositories.AvaliacaoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {

    @Autowired
    AvaliacaoRepo avaliacaoRepo;

    public List<Avaliacao> listar() {
        return avaliacaoRepo.findAll();
    }

    public Avaliacao criar(Avaliacao avaliacao) {
        return avaliacaoRepo.save(avaliacao);
    }
}
