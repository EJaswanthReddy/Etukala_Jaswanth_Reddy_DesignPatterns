package Creational.SingletonPattern;

public class Demo {
	public static void main(String[] args) {
		SingletonPattern object =  SingletonPattern.getInstance();
		object.showMessage();
	}
}