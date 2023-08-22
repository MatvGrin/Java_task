package money;

public class CurrencyExchange {
    private double hrivnaAccount;
    private double euroAccount;

    public CurrencyExchange(double money, double euro) {
        this.hrivnaAccount = money;
        this.euroAccount = euro;
    }

    public boolean sellCurrency(double euro) {
        if (this.euroAccount >= euro) {
            this.euroAccount -= euro;
            hrivnaAccount += euro * 42;
            return true;
        }
        return false;
    }

    public boolean buyCurrency(double euro) {
        if (hrivnaAccount >= euro * 40) {
            this.euroAccount += euro;
            hrivnaAccount -= euro * 40;
            return true;
        }
        return false;
    }

    public void showHrivnaAccount() {
        System.out.println(hrivnaAccount);
    }

    public void showEuroAccount() {
        System.out.println(euroAccount);
    }
}
