public abstract class CreditCard {
    private int debt;

    public CreditCard(int debt) {
        this.debt = debt;
    }


    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }


    public void pay(int amount) {
        debt += amount;
    }
}
