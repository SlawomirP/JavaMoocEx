package newpack;

public class Money {

    private final int euros; // po sutaleniu tego w konstruktorze juz nie bedzie mozna tego zmienic
    private final int cents; // to daje tutaj final

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
        // dodanie do konstruktora odejmowania
        if (cents < 0) {
            euros--;
            cents = 100 + cents;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

// First create the method public Money plus(Money addition)
// that returns a new money object that is worth
// the total amount of the object whose method was called
// and the object that is received as the parameter.

    public Money plus(Money addiction) {
        Money newMoney = new Money(euros() + addiction.euros(), cents() + addiction.cents());
        return newMoney;
    }
//Create the method public boolean lessThan(Money compared) that returns true if the money-object on
// which the method is called on has a lesser value than the money object given as a parameter.

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros <= compared.euros() && this.cents < compared.cents()) {
            return true;
        }
        return false;
    }

    //Write the method public Money minus(Money decreaser) that returns a new money object worth
    // the difference of the object whose method was called and the object received as the parameter.
    // If the difference would be negative, the worth of the created money object is set to 0.

    public Money minus(Money decreaser) {
        Money decreaseMoney = new Money(euros() - decreaser.euros(), cents() - decreaser.cents());
        if (decreaseMoney.euros() < 0) {
            Money zeroMoney = new Money(0, 0);
            return zeroMoney;
        }
        return decreaseMoney;
    }
}
