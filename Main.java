abstract class AbstractClass {
    // Abstract method
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method inside the abstract class.");
    }
}

// Subclass inheriting from the abstract class
class SubClass extends AbstractClass {
    // Implementing the abstract method
    void abstractMethod() {
        System.out.println("This is the implementation of abstractMethod() in the subclass.");
    }

    // Method to create an object of the abstract class and invoke its non-abstract method
    void invokeMethods() {
        // Creating an object of the abstract class within the subclass
        AbstractClass obj = new SubClass();

        // Calling abstract method
        obj.abstractMethod();

        // Calling non-abstract method
        obj.nonAbstractMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        SubClass subClassObj = new SubClass();
        subClassObj.invokeMethods();
    }
}