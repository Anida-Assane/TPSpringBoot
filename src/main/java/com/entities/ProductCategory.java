package entities;

import javax.persistence.*;

@Entity
@Table(name = "product_category")
public class ProductCategory {
	@Id
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@Id
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	// Getters et Setters

	public Product getProduct() {
		return product;
	}

	public Category getCategory() {
		return category;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
