package oops;

// Static Initializer executes only one when the class loads by JVM
// Instance Initializer executes before constructor
class InitDemo {
    static {
        System.out.println("Static block - runs once when class loads");
    }

    {
        System.out.println("Instance block - runs before constructor");
    }

    InitDemo() {
        System.out.println("Constructor - runs after instance block");
    }
}

public class Initializer_Block {

	public static void main(String[] args) {

		 new InitDemo();
	     new InitDemo();

	}

}
