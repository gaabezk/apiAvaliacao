package br.com.filmesplus.avaliacao.controllers;

import br.com.filmesplus.avaliacao.models.Avaliacao;
import br.com.filmesplus.avaliacao.services.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliar")
public class AvaliacaoController {

    @Autowired
    AvaliacaoService avaliacaoService;

    @GetMapping
    public ResponseEntity<List<Avaliacao>> getAll() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Listar avaliaçoes", "Retorna a lista de avaliaçoes");
        return new ResponseEntity<>(avaliacaoService.listar(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Avaliacao> cadastro(@RequestBody Avaliacao avaliacao) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Inserir avaliação", "Insere uma avaliação");
        return new ResponseEntity<>(avaliacaoService.criar(avaliacao), headers, HttpStatus.CREATED);
    }
}
