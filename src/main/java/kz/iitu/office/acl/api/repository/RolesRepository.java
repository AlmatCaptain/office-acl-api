package kz.iitu.office.acl.api.repository;

import kz.iitu.office.acl.api.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Role, Long> {}
