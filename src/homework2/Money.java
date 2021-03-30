package homework2;

public class Money {
    long hryvnia;
    byte kopeck;

    public Money(long hryvnia,byte kopeck) {
        if(kopeck==100){
            hryvnia++;
            kopeck = 0;
        }

        this.hryvnia = hryvnia;
        this.kopeck = kopeck;
    }

    public Money addition(Money money){
        long resultHryvnia = this.hryvnia + money.hryvnia;
        int resultKopeck = this.kopeck + money.kopeck;
        if (resultKopeck > 100){
            resultHryvnia++;
            resultKopeck -= 100;
        }
        return new Money(resultHryvnia, (byte) resultKopeck);
    }
    public Money subtraction(Money money){
        long resultHryvnia = this.hryvnia - money.hryvnia;
        int resultKopeck = this.kopeck - money.kopeck;
        if (hryvnia < 0 && kopeck < 0) {
            kopeck *= -1;
        } else if (kopeck < 0) {
            hryvnia *= -1;
            kopeck *= -1;
        }
        if (kopeck > 100) {
            ++hryvnia;
            kopeck -= 100;
        }
        return new Money(resultHryvnia, (byte) resultKopeck);
    }
    public Money multiplication(Money money){
        return this.multiplicationToDouble(money.toDouble());
    }

    public Money division(Money money){
        return this.divisionToDouble(money.toDouble());
    }

    public Money divisionToDouble(double val) {
        double money = this.toDouble();
        return doubleToMoney(money / val);
    }

    public Money multiplicationToDouble(double val) {
        double money = this.toDouble();
        return doubleToMoney(money * val);
    }

    public boolean isEqual(Money money) {
        return (this.hryvnia == money.hryvnia && this.kopeck == money.kopeck);
    }

    public boolean isBigger(Money money) {
        return this.toDouble() > money.toDouble();
    }

    public boolean isBiggerOrEqual(Money money) { return this.toDouble() >= money.toDouble(); }

    private double toDouble() {
        return (this.hryvnia * 100 + this.kopeck) / 100d;
    }

    private Money doubleToMoney(double val) {
        long hryvnias = (long) val;
        byte kopecks = (byte) ((val - hryvnias) * 100);
        return new Money(hryvnias, kopecks);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money secondMoney = (Money) obj;
            return this.hryvnia == secondMoney.hryvnia && this.kopeck == secondMoney.kopeck;
        }
        return false;
    }

    @Override
    public String toString() {
        return hryvnia + "," + kopeck;
    }
}
