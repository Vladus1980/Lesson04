package Lesson04;

public class ApplicationRobot {

	public static void main(String[] args) {
		
		Robot r1 = new Robot("я просто працюю");
		System.out.println(r1);
		
		CoffeRobot r2 = new CoffeRobot("я варю каву");
		System.out.println(r2);
		
		RobotDancer r3 = new RobotDancer("я просто танцюю");
		System.out.println(r3);
		
		RobotCoocker r4 = new RobotCoocker("я просто готую");
		System.out.println(r4);
				

	
	Object [] array = {r1, r2, r3, r4};
	int i;
	for 
	(i = 0; i < array.length; i++) {
	System.out.println(array[i]);
	};
	
	
	
	
}

	@Override
	public String toString() {
		return "ApplicationRobot [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
