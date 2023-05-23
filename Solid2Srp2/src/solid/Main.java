package src.solid;

import solid.srp.models.Order;
import src.solid.srp.models.FactoryOrder;
import src.solid.srp.models.Saver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        FactoryOrder fo = new FactoryOrder();
        Order order = fo.createOrder();
        Saver save = new Saver("order1",order);
        save.saveToJson();
    }
}
