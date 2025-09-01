package oops;

class Persons {
    String name;
    Persons(String name) { this.name = name; }
}

public class PassByValueVsReference {
    
    // For primitive
    public static void changePrimitive(int num) {
        num = 100; // only changes local copy
    }

    // For object (change field)
    public static void changeObjectData(Persons p) {
        p.name = "Alice"; // affects the same object
    }

    // For object (reassign reference)
    public static void reassignObject(Persons p) {
        p = new Persons("Charlie"); // only local reference points to new object
    }

    public static void main(String[] args) {
        // Primitive example
        int x = 10;
        System.out.println("Before primitive: x = " + x);
        changePrimitive(x);
        System.out.println("After primitive: x = " + x); // still 10

        System.out.println("--------------------");

        // Object example
        Persons person = new Persons("Bob");
        System.out.println("Before object: name = " + person.name);

        changeObjectData(person);
        System.out.println("After changing data: name = " + person.name); // Alice

        reassignObject(person);
        System.out.println("After reassigning object: name = " + person.name); // still Alice
    }
}

