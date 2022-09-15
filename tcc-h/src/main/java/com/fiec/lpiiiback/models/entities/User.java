package com.fiec.lpiiiback.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String lastName;
    private String age;
    @Column(unique = true)
    private String email;
    private String cpf;
    private String password;
    private String profileImage;

    @OneToMany
    private List<Book> books = new ArrayList<>();
}
