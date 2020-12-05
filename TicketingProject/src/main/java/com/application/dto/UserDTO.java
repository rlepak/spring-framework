package com.application.dto;

import com.application.entity.Role;
import com.application.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;

}
