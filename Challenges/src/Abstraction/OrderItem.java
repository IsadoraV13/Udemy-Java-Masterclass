package Abstraction;

public class OrderItem {
    ProductForSale product;
    int quantity;

    public OrderItem(ProductForSale product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ProductForSale getProduct() {
        return product;
    }

    public void setProduct(ProductForSale product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
