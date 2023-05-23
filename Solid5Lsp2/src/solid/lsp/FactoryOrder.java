package src.solid.lsp;

import src.solid.lsp.OrderAbstract;

public class FactoryOrder {
    public OrderAbstract create(int qnt, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(qnt, price);
        }
        return new solid.lsp.Order(qnt, price);
    }
}
