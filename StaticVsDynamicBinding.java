package oops;


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Static_vs_Dynamic_Binding {
	
	// Static Binding
	 private void display() {
	        System.out.println("Private method - Static Binding");
	    }

	    static void show() {
	        System.out.println("Static method - Static Binding");
	    }

	public static void main(String[] args) {
		

		// Static Binding
		Static_vs_Dynamic_Binding sb = new Static_vs_Dynamic_Binding();
		sb.display();
		Static_vs_Dynamic_Binding.show();
		
		// Dynamic binding
		Animal obj = new Dog();
		obj.sound();
		

	}

}
