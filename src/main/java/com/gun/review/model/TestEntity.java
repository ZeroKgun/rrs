package com.gun.review.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "test")
@Getter
@Entity
@NoArgsConstructor
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;

    public TestEntity(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void changeNameAndAge(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}
