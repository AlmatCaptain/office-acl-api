package kz.iitu.office.acl.api.controller;

import kz.iitu.office.acl.api.model.Role;
import kz.iitu.office.acl.api.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    private final RolesRepository rolesRepository;

    @Autowired
    public RoleController(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    @GetMapping
    public List<Role> getAllRoles() {
        return rolesRepository.findAll();
    }
}
