package money;

public class CurrencyExchangeDemo {
    public static void main(String[] args) {
        CurrencyExchange currency = new CurrencyExchange(100_000,0);

        System.out.println(currency.buyCurrency(100));

        currency.showHrivnaAccount();
        currency.showEuroAccount();

        System.out.println(currency.sellCurrency(100));

        currency.showHrivnaAccount();
        currency.showEuroAccount();

        System.out.println(currency.sellCurrency(90));

        currency.showHrivnaAccount();
        currency.showEuroAccount();

        System.out.println(currency.buyCurrency(2505));

        currency.showHrivnaAccount();
        currency.showEuroAccount();

        System.out.println(currency.buyCurrency(10));

        currency.showHrivnaAccount();
        currency.showEuroAccount();

        System.out.println(currency.sellCurrency(2505));

        currency.showHrivnaAccount();
        currency.showEuroAccount();
    }
}
