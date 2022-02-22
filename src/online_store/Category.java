package online_store;

public class Category {
    String name_of_category;
    Product[] products;

    public Category() {

    }

    public Category(String name_of_category, Product[] products) {
        this.name_of_category = name_of_category;
        this.products = products;
    }

    public String getName_of_category() {
        return name_of_category;
    }

    public void setName_of_category(String name_of_category) {
        this.name_of_category = name_of_category;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
