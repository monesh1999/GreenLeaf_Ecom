package com.greenleaf.greenleaf.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
 * @return the id
 */
public Long getId() {
	return id;
}

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
	this.id = id;
  }

  /**
   * @return the username
   */
  public String getUsername() {
	return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
	this.username = username;
  }

  /**
   * @return the password
   */
  public String getPassword() {
	return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
	this.password = password;
  }

  /**
   * @return the email
   */
  public String getEmail() {
	return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
	this.email = email;
  }

  /**
   * @return the roles
   */
  public Set<role> getRoles() {
	return roles;
  }

  /**
   * @param roles the roles to set
   */
  public void setRoles(Set<role> roles) {
	this.roles = roles;
  }

  @Column(unique = true, nullable = false)
  private String username;

  @Column(nullable = false)
  private String password;

  private String email;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable( name = "user_roles",
      joinColumns = @JoinColumn(name = "user_id"),
      inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<role> roles;

  
}
