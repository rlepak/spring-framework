package com.cybertek.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"hibarnateLazyInitializer"}, ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Course extends BaseEntity{

    @Column(columnDefinition = "text")
    private String description;
    private String name;
}
