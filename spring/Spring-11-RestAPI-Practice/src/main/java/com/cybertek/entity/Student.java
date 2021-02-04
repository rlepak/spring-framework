package com.cybertek.entity;

import com.cybertek.enums.EducationLevel;
import com.cybertek.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"hibarnateLazyInitializer"}, ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student extends BaseEntity{

    private LocalDate birthday;
    private String email;
    private String firstName;
    private String lastName;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String username;

    @OneToOne
    private Address address;

    @OneToOne
    private Parent parent;
}
