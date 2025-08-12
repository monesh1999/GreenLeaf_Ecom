package com.greenleaf.greenleaf.models;


import jakarta.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
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
   * @return the user
   */
  public User getUser() {
	return user;
  }

  /**
   * @param user the user to set
   */
  public void setUser(User user) {
	this.user = user;
  }

  /**
   * @return the items
   */
  public List<OrderItem> getItems() {
	return items;
  }

  /**
   * @param items the items to set
   */
  public void setItems(List<OrderItem> items) {
	this.items = items;
  }

  /**
   * @return the orderedAt
   */
  public Instant getOrderedAt() {
	return orderedAt;
  }

  /**
   * @param orderedAt the orderedAt to set
   */
  public void setOrderedAt(Instant orderedAt) {
	this.orderedAt = orderedAt;
  }

  /**
   * @return the total
   */
  public Double getTotal() {
	return total;
  }

  /**
   * @param total the total to set
   */
  public void setTotal(Double total) {
	this.total = total;
  }

  @ManyToOne
  private User user;

  @OneToMany(cascade = CascadeType.ALL)
  private List<OrderItem> items;

  private Instant orderedAt;

  private Double total;

  
  public Order() { this.orderedAt = Instant.now(); }
  
}
