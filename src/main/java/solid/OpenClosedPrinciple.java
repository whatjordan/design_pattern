package solid;

public class OpenClosedPrinciple {
    /**
     * Entities should be open for extensions, but closed for modification.
     */
}

class Original {
    void print() {
        System.out.println("original");
    }
}

class Inheritance extends Original {
    @Override
    void print() {
        super.print();
        System.out.println("Inheritance");
    }
}