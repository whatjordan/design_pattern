package behavior.command;

public class Application {
    private String name;

    public Application(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println("open app: " + name);
    }
}
