package Abstraction;

public class CoffeeMachine extends ProductForSale{
    public CoffeeMachine(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void productDetails(ProductForSale product) {
        System.out.println("This " + product.type + product.description);;

    }
}
