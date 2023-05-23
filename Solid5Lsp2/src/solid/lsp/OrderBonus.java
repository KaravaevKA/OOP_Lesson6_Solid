package src.solid.lsp;

import src.solid.lsp.OrderAbstract;

public class OrderBonus extends OrderAbstract {

    public OrderBonus(int qnt, int price) {
        super(price, qnt);
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return "OrderBonus{" +
                "price=" + price +
                ", qnt=" + qnt +
                '}';
    }
}
