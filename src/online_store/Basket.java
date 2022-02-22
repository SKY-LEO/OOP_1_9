package online_store;

public class Basket {
    Product[] purchased_products;
    int i;

    public Basket() {

    }

    public Basket(int capacity) {
        purchased_products = new Product[capacity];
    }

    public Product[] getPurchased_products() {
        return purchased_products;
    }

    public void setPurchased_products(Product[] purchased_products) {
        this.purchased_products = purchased_products;
    }

    public boolean addProduct(Product product) {
        if (i < purchased_products.length) {
            purchased_products[i] = product;
            i++;
            return true;
        } else {
            return false;
        }
    }
}
