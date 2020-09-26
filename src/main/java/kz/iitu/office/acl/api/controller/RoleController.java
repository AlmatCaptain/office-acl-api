package kz.iitu.office.acl.api.controller;

import kz.iitu.office.acl.api.model.Role;
import kz.iitu.office.acl.api.model.dto.EmployeeRoleDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {

    @GetMapping("/")
    public List<Role> getAll() {
        return Arrays.asList(
                new Role(1L, "ROLE_ADMIN"),
                new Role(2L, "ROLE_USER")
        );
    }

    @GetMapping("/{userId}")
    public EmployeeRoleDTO getEmployeeRole(@PathVariable Long userId) {

        if (userId == 1L)
            return new EmployeeRoleDTO(1L,userId,"ROLE_ADMIN");
        else
            return new EmployeeRoleDTO(2L, userId, "ROLE_USER");
    }
}
