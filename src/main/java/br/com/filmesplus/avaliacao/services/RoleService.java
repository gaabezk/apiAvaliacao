package br.com.filmesplus.avaliacao.services;

import br.com.filmesplus.avaliacao.models.Role;
import br.com.filmesplus.avaliacao.respositories.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    RoleRepo roleRepo;

    public Role criar(Role role) {
        Optional<Role> optional = roleRepo.findByNome(role.getNome());
        if (optional.isPresent()) {
            throw new Error("Role já existe!");
        }
        return roleRepo.save(role);
    }


}
