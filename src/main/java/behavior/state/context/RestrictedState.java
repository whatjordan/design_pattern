package behavior.state.context;

public class RestrictedState extends AccountState {
    public RestrictedState(Account account) {
        super(account);
    }

    @Override
    public void deposit(double money) {
        account.setBalance(account.getBalance() + money);
        stateCheck();
    }

    @Override
    public void withdraw(double money) {
        System.out.println(account.getName() + " can't withdraw, balance: " + account.getBalance());
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(account));
        }
    }
}
