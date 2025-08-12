package com.greenleaf.greenleaf.models;


import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name; // e.g., ROLE_USER, ROLE_ADMIN

    // constructors, getters, setters
    public role() {}
    public role(String name) { this.name = name; }
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
