package behavior.state.context;

public class NormalState extends AccountState {
    public NormalState(Account account) {
        super(account);
    }

    @Override
    public void deposit(double money) {
        account.setBalance(account.getBalance() + money);
    }

    @Override
    public void withdraw(double money) {
        account.setBalance(account.getBalance() - money);
        stateCheck();
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() <= 0) {
            account.setState(new RestrictedState(account));
        }
    }
}
