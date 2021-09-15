package behavior.state.context;

public class Account {
    private AccountState state;
    private double balance;
    private String name;

    public Account(String name) {
        this.name = name;
        this.state = new RestrictedState(this);
    }

    public void deposit(double money) {
        state.deposit(money);
    }

    public void withdraw(double money) {
        state.withdraw(money);
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
