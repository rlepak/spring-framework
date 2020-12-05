package com.application.entity;

import com.application.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Boolean enabled;
    private String phone;
    private Role role;
    private Gender gender;

    public User(Long id, LocalDate insertDataTime, LocalDate insertUserID, LocalDateTime lastUpdateDateTime, Long lastUpdateID, String firstName, String lastName, String userName, String password, Boolean enabled, String phone, Role role, Gender gender) {
        super(id, insertDataTime, insertUserID, lastUpdateDateTime, lastUpdateID);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.phone = phone;
        this.role = role;
        this.gender = gender;
    }
}
