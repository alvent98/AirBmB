import java.math.*;

public class Money {

    private static double money;

    Money(double price){
        BigDecimal bd = new BigDecimal(price);
        bd = bd.setScale(2);
        money=bd.doubleValue();
    }

    public static double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
