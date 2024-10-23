package Houmworck_19.model;

import java.util.Objects;

public class Food extends Product{
    //FD
    private String expDate;

    //get&set

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    //toStr

    @Override
    public String toString() {
        return "Food{" +
                "expDate='" + expDate + '\'' +
                "} " + super.toString();
    }
    // equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(expDate, food.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expDate);
    }
}
