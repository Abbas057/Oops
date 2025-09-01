package oops;
class Student {
    String name;

    Student(String name) {
        this.name = name;
        System.out.println("Object created for " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed for " + name);
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        // Create 3 students
        Student s1 = new Student("Abbas");
        Student s2 = new Student("Faleel");
        Student s3 = new Student("Ali");

        // Remove reference to s1
        s1 = null; // Abbas object eligible for GC

        // Reassign s2 to point to s3
        s2 = s3;   // Faleel object is no longer referenced, eligible for GC

        // s3 is still pointing to "Ali", so it's safe
        System.out.println("Currently active: " + s3.name);

        // Suggest JVM to run GC
        System.gc();
    }
}
