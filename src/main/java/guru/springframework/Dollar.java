package guru.springframework;

/**
 * Created by jt on 2018-10-04.
 */
public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times( int multiplier) {
        return new Dollar(amount * multiplier);
    }

    // Override method for equality test - determine if Dollar amounts are equal
    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
