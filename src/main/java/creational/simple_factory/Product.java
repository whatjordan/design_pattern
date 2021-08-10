package creational.simple_factory;

public abstract class Product {
    public abstract void work();
    //We can simplify simple factory by merging static factory method into the abstract product class
//    public static Product getProduct(ProductType type){
//        switch (type) {
//            case Phone:
//                return new Phone();
//            case PAD:
//                return new Pad();
//            default:
//                return null;
//        }
//    }
}
