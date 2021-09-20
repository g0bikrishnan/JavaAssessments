package hierarchical;

public class Dog extends Animal {
public Dog() {
	System.out.println("Dog is also a"+super.name);
}
public static void main(String[] args) {
	Dog d=new Dog();
}
}
