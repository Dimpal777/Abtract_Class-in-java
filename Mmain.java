abstract class AbstractClass {
    // Abstract method
    abstract void abstractMethod();
}

class SubClass extends AbstractClass {
    // Implementing the abstract method
    void abstractMethod() {
        System.out.println("Implementation of abstractMethod() in SubClass.");
    }

    void callAbstractMethod() {
        SubClass subObj = new SubClass();

        // Calling abstract method of the subclass
        subObj.abstractMethod();
    }
}

public class Mmain {
    public static void main(String[] args) {
        SubClass subClassObj = new SubClass();
        subClassObj.callAbstractMethod();
    }
}