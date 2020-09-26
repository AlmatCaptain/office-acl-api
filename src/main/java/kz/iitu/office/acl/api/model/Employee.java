package kz.iitu.office.acl.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Employee {
    private Long id;
    private String username;
    private String password;
}