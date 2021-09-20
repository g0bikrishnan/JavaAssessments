package hierarchical;

public class Cat  extends Animal{
	String name="cat";
public Cat() {
	
	System.out.println("cat is a  "+super.name);
}
public static void main(String[] args) {
	Cat c=new Cat();
}

}
