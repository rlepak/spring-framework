package com.application.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseEntity {

    private Long id;
    private LocalDate insertDataTime;
    private LocalDate insertUserID;
    private LocalDateTime lastUpdateDateTime;
    private Long lastUpdateID;

}
