package behavior.state.context;

public abstract class AccountState {
    protected Account account;

    public AccountState(Account account) {
        this.account = account;
    }

    public abstract void deposit(double money);

    public abstract void withdraw(double money);

    public abstract void stateCheck();
}
