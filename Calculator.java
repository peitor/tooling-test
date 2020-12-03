
public class Calculator {


    private Currency localCurrency;

    public Calculator() {
        this.localCurrency = new Currency();
    }

    public void setItUp(Currency localCurrencyFromUser) {
        this.localCurrency = localCurrencyFromUser;
    }
}