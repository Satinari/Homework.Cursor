package homework2;

public class Fraction {
    long firstNumber;
    short secondNumber;

    public Fraction(long firstNumber,short secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("The secondNumber is zero.");
        }
        if(firstNumber==0){
            this.firstNumber = 0;
            this.secondNumber = 1;
        } else{
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }
        if(secondNumber<0){
            this.firstNumber = -firstNumber;
            this.secondNumber = (short) -secondNumber;
        }
    }

    public Fraction addition(Fraction fraction){
        long resultOfFirstNumber = this.firstNumber*fraction.secondNumber+this.secondNumber*fraction.firstNumber;
        short resultOfSecondNumber = (short) (this.secondNumber*fraction.secondNumber);
        return new Fraction(resultOfFirstNumber, resultOfSecondNumber);
    }
    public Fraction subtraction(Fraction fraction) {
        long resultOfFirstNumber = this.firstNumber * fraction.secondNumber - this.secondNumber * fraction.firstNumber;
        short resultOfSecondNumber = (short) (this.secondNumber * fraction.secondNumber);
        return new Fraction(resultOfFirstNumber, resultOfSecondNumber);
    }

    public Fraction multiplication(Fraction fraction) {
        long resultOfFirstNumber = this.firstNumber * fraction.firstNumber;
        short resultOfSecondNumber = (short) (this.secondNumber * fraction.secondNumber);
        return new Fraction(resultOfFirstNumber, resultOfSecondNumber);
    }

    public Fraction division(Fraction fraction) {
        long resultOfFirstNumber = this.firstNumber * fraction.secondNumber;
        short resultOfSecondNumber = (short) (this.secondNumber * fraction.firstNumber);
        return new Fraction(resultOfFirstNumber, resultOfSecondNumber);
    }

    public boolean isEqual(Fraction fraction) {
        return (firstNumber == fraction.firstNumber && this.secondNumber == fraction.secondNumber);
    }

    public boolean isBigger(Fraction fraction) {
        return ((double) this.firstNumber / this.secondNumber > (double) fraction.firstNumber / fraction.secondNumber);
    }

    public boolean isBiggerOrEqual(Fraction fraction) {
        return ((double) this.firstNumber / this.secondNumber >= (double) fraction.firstNumber / fraction.secondNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction secondFraction = (Fraction) obj;
            return (this.firstNumber == secondFraction.firstNumber && this.secondNumber == secondFraction.secondNumber);
        }
        return false;
    }

    @Override
    public String toString() {
        if(secondNumber!=1)
            return firstNumber+"/"+secondNumber;
        else
            return firstNumber+"";
    }
}
