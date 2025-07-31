package com.viniciusDev.agregadordeinvestimentos.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @CreationTimestamp
    private Instant creationTimesTamp;

    @UpdateTimestamp
    private Instant updateTimestamp;

    // Construtor vazio
    public User() {}

    // Construtor com campos (sem timestamps)
        public User(UUID userId, String username, String email, String password) {
            this.userId = userId;
            this.username = username;
            this.email = email;
            this.password = password;
        }

    // Getters e setters (se precisar, posso ajudar a gerar também)
}
