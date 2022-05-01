package tr.unvercanunlu.patterns.strategy.model;

public class CreditCard {

    public String name;
    public String no;
    public String cvv;
    public String expireDate;

    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + "', " +
                "no='" + no + "', " +
                "cvv='" + cvv + "', " +
                "expireDate='" + expireDate + "'" +
                '}';
    }
}
