package creational.abstract_factory;

public class AndroidPhone implements Phone {
    @Override
    public void work() {
        System.out.println("call someone via android phone");
    }
}
