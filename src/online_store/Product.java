package online_store;

public class Product {
    String name_of_product;
    double price;
    double rating;

    public Product(){

    }

    public Product(String name_of_product, double price, double rating) {
        this.name_of_product = name_of_product;
        this.price = price;
        this.rating = rating;
    }

    public String getName_of_product() {
        return name_of_product;
    }

    public void setName_of_product(String name_of_product) {
        this.name_of_product = name_of_product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
