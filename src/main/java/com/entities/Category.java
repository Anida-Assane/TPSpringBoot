package entities;
import javax.persistence.*;
import java.util.List;
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    private Category parentCategory;

    @OneToMany(mappedBy = "parentCategory")
    private List<Category> subCategories;

    @ManyToMany(mappedBy = "categories")
    private List<Product> products;

    // Getters et Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public entities.Category getParentCategory() {
        return parentCategory;
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentCategory(entities.Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
