package src.solid.isp;

public interface PayableTerminal {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
}
