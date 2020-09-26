package kz.iitu.office.acl.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeRoleDTO {

    private Long roleId;
    private Long employeeId;
    private String roleName;

}
