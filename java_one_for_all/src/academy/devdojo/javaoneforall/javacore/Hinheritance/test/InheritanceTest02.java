package academy.devdojo.javaoneforall.javacore.Hinheritance.test;

import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Manager;

public class InheritanceTest02 {
    public static void main(String[] args) {
        // 0 - Static init block from the superClass is executed when the jvm loads the class and only once
        // 1 - Static init block from the subclass is executed when the jvm loads the class and only once
        // 2 - Memory allocated for the superclass
        // 3 - Each class attribute from the superclass is initialized
        // 4 - Init block from the superclass is executed in the order they appear
        // 5 - The constructor from the superclass is executed
        // 6 - Memory allocated for the subclass
        // 7 - Each class attribute from the subclass is initialized
        // 8 - Init block from the subclass is executed in the order they appear
        // 9 - The constructor from the subclass is executed

        // Inside Employee Static init Block
        // Inside Manager Static init Block
        // Inside Employee init block one
        // Inside Employee init block two
        // Inside Employee constructor
        // Inside Manager init block one
        // Inside Manager init block two
        // Inside Manager constructor
        new Manager("Jiraya");
    }
}
