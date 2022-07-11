package br.com.filmesplus.avaliacao.controllers;

import br.com.filmesplus.avaliacao.models.Usuario;
import br.com.filmesplus.avaliacao.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/get")
    public ResponseEntity<List<Usuario>> listarTodos() {
        return ResponseEntity.ok(usuarioService.listarTodos());
    }

    @PostMapping("/post")
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.salvar(usuario));
    }

    @PostMapping("/valid")
    public ResponseEntity<Boolean> validarSenha(@RequestParam String username,
                                                @RequestParam String senha) {

        boolean valid = (usuarioService.validarSenha(username, senha));
        HttpStatus status = (valid) ? HttpStatus.UNAUTHORIZED : HttpStatus.OK;
        return ResponseEntity.status(status).body(valid);
    }
}
