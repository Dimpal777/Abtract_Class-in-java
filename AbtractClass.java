    abstract class AbstractClass {
    // Abstract method (method without body)
    abstract void abstractMethod();

    // Non-abstract method (method with body)
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method inside the abstract class.");
    }

    // Another non-abstract method
    void anotherNonAbstractMethod() {
        System.out.println("This is another non-abstract method inside the abstract class.");
    }
}
     public class AbtractClass {
    public static void main(String[] args) {
    
        ConcreteClass obj = new ConcreteClass();
        obj.abstractMethod(); // Calling abstract method
        obj.nonAbstractMethod(); // Calling non-abstract method
        obj.anotherNonAbstractMethod(); // Calling another non-abstract method
    }
}

// Concrete class extending the abstract class
     class ConcreteClass extends AbstractClass {
    // Implementing the abstract method from the abstract class
    void abstractMethod() {
        System.out.println("This is an abstract method implementation in the concrete class.");
    }
}
