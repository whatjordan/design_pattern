package solid;

public class InterfaceSegregationPrinciple {
    /**
     * NO client should be forced to depend on methods it does not use.
     */
}

class SmartPhone implements Voice, InternetAccessibility {

    public void call() {
        System.out.println("call");
    }

    public void surfInternet() {
        System.out.println("surf internet");
    }
}

class Telephone1 implements Voice {
    public void call() {
        System.out.println("call");
    }
}

/**
 * Negative example. A client needs to implement all methods of Phone interface.
 */
class Telephone2 implements Phone {
    public void call() {
        System.out.println("call");
    }

    public void surfInternet() {
        /**
         * Doesn't use this function.
         */
    }
}

interface Voice {
    void call();
}

interface InternetAccessibility {
    void surfInternet();
}

/**
 * Irrational interface
 */
interface Phone {
    void call();

    void surfInternet();
}
