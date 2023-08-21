package money;

public class CurrencyExchangeDemo {
    public static void main(String[] args) {
        CurrencyExchange currency = new CurrencyExchange(100_000,0);

        System.out.println(currency.buyCurrency(100));

        currency.showHrivnaAccount();
        currency.showEuroAccount();

        System.out.println(currency.sellCurrency(10));

        currency.showHrivnaAccount();
        currency.showEuroAccount();

        System.out.println(currency.sellCurrency(90));

        currency.showHrivnaAccount();
        currency.showEuroAccount();
    }
}
