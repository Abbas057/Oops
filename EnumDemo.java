package oops;

//1. Days of Week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

//2. Enums with Switch

enum TrafficLight {
    RED, YELLOW, GREEN
}

//3. Enums with Fields and Methods

enum Status {
    SUCCESS(200), ERROR(500), NOT_FOUND(404);

    private int code;

    // Constructor
    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}


public class EnumDemo {

	public static void main(String[] args) {
		
		//1. Days of Week
		Day today = Day.FRIDAY;
		
		if(today==Day.FRIDAY)
			System.out.println("Weekend is near");
		
		for(Day d: Day.values()) {
			System.out.println(d);
		}
		
		//2. Enums with Switch
		
		TrafficLight signal = TrafficLight.RED;
		
		switch(signal) {
		case RED:
			System.out.println("Stop!");
			break;
		case YELLOW:
			System.out.println("Get Ready!");
			break;
		case GREEN:
			System.out.println("Go!");
			break;
			
		}
		
		//3. Enums with Fields and Methods
		
		Status s = Status.SUCCESS;
        System.out.println(s + " code: " + s.getCode());
		
		

	}

}
