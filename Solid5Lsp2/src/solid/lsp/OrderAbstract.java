package src.solid.lsp;

public abstract class OrderAbstract {
    protected int price;
    protected int qnt;

    public OrderAbstract(int price, int qnt) {
        this.price = price;
        this.qnt = qnt;
    }
    public abstract int getAmount();

}
