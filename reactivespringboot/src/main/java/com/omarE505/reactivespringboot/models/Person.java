package com.omarE505.reactivespringboot.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "persons")
public class Person {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
