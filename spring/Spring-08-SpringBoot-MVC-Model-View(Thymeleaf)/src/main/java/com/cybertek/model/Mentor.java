package com.cybertek.model;

import com.cybertek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mentor {

    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
}
