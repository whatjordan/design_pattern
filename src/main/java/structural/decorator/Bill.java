package structural.decorator;

public abstract class Bill {

    public Bill(double total){
        this.total = total;
    }

    protected double total;

    abstract double calculateAmount();

    public double getTotal() {
        return total;
    }
}
