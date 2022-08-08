package br.com.filmesplus.avaliacao.controllers;

import br.com.filmesplus.avaliacao.models.Role;
import br.com.filmesplus.avaliacao.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping
    public ResponseEntity<Role> criar(@RequestBody Role role){
        return ResponseEntity.ok(roleService.criar(role));
    }

}
