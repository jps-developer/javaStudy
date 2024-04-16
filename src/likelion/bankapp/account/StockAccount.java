package likelion.bankapp.account;

public class StockAccount extends Account {

    int stockHoldings;

    public StockAccount(Long accountNum, String name, int balance) {
        super(accountNum, name, balance);
        this.stockHoldings = 0;
    }

    public int buyStock(int stockAmount, int price){
        stockHoldings += stockAmount;
        withdraw(stockAmount * price);
        return stockHoldings;
    }

    public int sellStock(int stockAmount, int price){
        stockHoldings -= stockAmount;
        deposit(stockAmount * price);
        return stockHoldings;
    }

    public int getStockHoldings() {
        return stockHoldings;
    }

    public void setStockHoldings(int stockHoldings) {
        this.stockHoldings = stockHoldings;
    }
}
