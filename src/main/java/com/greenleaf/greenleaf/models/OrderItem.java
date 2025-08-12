package com.greenleaf.greenleaf.models;

import jakarta.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {
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
   * @return the product
   */
  public Product getProduct() {
	return product;
  }

  /**
   * @param product the product to set
   */
  public void setProduct(Product product) {
	this.product = product;
  }

  /**
   * @return the quantity
   */
  public Integer getQuantity() {
	return quantity;
  }

  /**
   * @param quantity the quantity to set
   */
  public void setQuantity(Integer quantity) {
	this.quantity = quantity;
  }

  @ManyToOne
  private Product product;

  private Integer quantity;

  
}
