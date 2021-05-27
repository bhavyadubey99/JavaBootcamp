package Inheritance;

public class Client {

	public static void main(String[] args) {
		//case 1 
		Parent obj1 = new Parent();
		//case 2 
		Parent obj2 = new Child();
		//case 3
		//Child obj3 = new Parent(); --> Impossible
		//case 4 
		Child obj4 = new Child();
		
		obj4.fun();
		System.out.println(obj4.fun(5));
		

	}

}
