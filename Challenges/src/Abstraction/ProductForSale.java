package Abstraction;

public abstract class ProductForSale {
    String type;
    double price;
    String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalesPrice(int quantity, ProductForSale product) {
        return quantity * product.getPrice();
    }

    public void itemisedLineItem(OrderItem orderItem) {
        int n = orderItem.getProduct().getType().length();
        String repeated = new String(new char[20-n]).replace("\0", "-");
        System.out.println(orderItem.quantity + " x " + orderItem.getProduct().getType() + " " + repeated + " " +
                getSalesPrice(orderItem.quantity, orderItem.getProduct()));
    }

    public abstract void productDetails(ProductForSale product);
        // shows product details
}
