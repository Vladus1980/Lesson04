package Lesson04;

public class ApplicationAnimal {

	public static void main(String[] args) {
		
		Animal a = new Animal("�������", 40, 5);
		System.out.println(a);
		
		a.setName("������");
		a.setSpeed(50);
		a.setAge(7);
		System.out.println(a);

	}

}
