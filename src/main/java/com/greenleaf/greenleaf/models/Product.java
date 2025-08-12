package com.greenleaf.greenleaf.models;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
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
   * @return the name
   */
  public String getName() {
	return name;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
	this.name = name;
  }
  /**
   * @return the description
   */
  public String getDescription() {
	return description;
  }
  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
	this.description = description;
  }
  /**
   * @return the price
   */
  public Double getPrice() {
	return price;
  }
  /**
   * @param price the price to set
   */
  public void setPrice(Double price) {
	this.price = price;
  }
  /**
   * @return the stock
   */
  public Integer getStock() {
	return stock;
  }
  /**
   * @param stock the stock to set
   */
  public void setStock(Integer stock) {
	this.stock = stock;
  }
  private String name;
  public Product(Long id, String name, String description, Double price, Integer stock) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
	this.stock = stock;
}
  private String description;
  private Double price;
  private Integer stock;
  
  

  
}
