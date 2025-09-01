package oops;

record Person(String name, int age) {}

public class RecordDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Abbas", 23);
		
		 // Accessors instead of getters
        System.out.println(p1.name());
        System.out.println(p1.age());

        // toString() automatically implemented
        System.out.println(p1);

        // equals and hashCode also auto-generated
        Person p2 = new Person("Abbas", 25);
        System.out.println(p1.equals(p2)); // true
		

	}

}
