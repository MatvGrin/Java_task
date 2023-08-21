package money;

public class CurrencyExchange {
    private double money;
    private double euro;

    public CurrencyExchange(double money, double euro) {
        this.money = money;
        this.euro = euro;
    }

    public boolean sellCurrency(double euro){
        if (money >= 42){
            this.euro -= euro;
            money = money + euro * 42;
            return true;
        }
        return false;
    }

    public boolean buyCurrency(double euro){
        if (money >= 40){
            this.euro += euro;
            money = money - euro * 40;
            return true;
        }
        return false;
    }

    public void showHrivnaAccount(){
        System.out.println(money);
    }

    public void showEuroAccount(){
        System.out.println(euro);
    }
}
