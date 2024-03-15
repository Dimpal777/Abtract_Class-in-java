abstract class AbstractClass {
    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("Non-abstract method of AbstractClass called.");
    }
}

// Subclass inheriting from the abstract class
class SubClass extends AbstractClass {
    // Method to create an instance of the subclass and call non-abstract method
    void callNonAbstractMethod() {
        // Creating an instance of the subclass within the subclass itself
        SubClass subObj = new SubClass();

        // Calling non-abstract method of the subclass
        subObj.nonAbstractMethod();
    }
}

public class mainn {
    public static void main(String[] args) {
        SubClass subClassObj = new SubClass();
        subClassObj.callNonAbstractMethod();
    }
}