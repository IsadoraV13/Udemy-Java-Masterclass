package Abstraction;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine("Coffee machine", 999, " is like having a " +
                "barista in your kitchen! You will never have lethargic mornings again!");
        Kettle kettle = new Kettle("Kettle", 150, " heats 1.7 liters of water in a matter of " +
                "minutes.");
        OrderItem kettleOrderItem = new OrderItem(kettle, 2);
        // create order with kettles only
        ArrayList<OrderItem> order001 = createOrder(kettleOrderItem);
        printOrder(order001);
        System.out.println();
        // then add a coffee machine
        OrderItem coffeeMachineOrderItem = new OrderItem(coffeeMachine, 1);
        addItemToOrder(order001, coffeeMachineOrderItem);
        printOrder(order001);
        System.out.println();
        // if we wanted to display products in order
        System.out.println("website description:");
        displayProductDetails(order001);

    }


    public static void displayProductDetails(ArrayList<OrderItem> order) {
        for (OrderItem orderItem : order) {
            orderItem.getProduct().productDetails(orderItem.getProduct());
        }
    }
    public static ArrayList<OrderItem> createOrder(OrderItem... OrderItems) {
        ArrayList<OrderItem> order = new ArrayList<>();
        for (OrderItem orderItem : OrderItems) {
            order.add(orderItem);
        }
        return order;
    }

    public static ArrayList<OrderItem> addItemToOrder(ArrayList<OrderItem> order, OrderItem orderItem) {
        order.add(orderItem);
        return order;
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        System.out.println("Items in order: ");
        for (OrderItem orderItem : order) {
            orderItem.product.itemisedLineItem(orderItem);
            }
        }


}
