package multilevel;

public class Tiger extends Cat {
public Tiger() {
	System.out.println("Tiger is also a "+super.name);
	
}
public static void main(String[] args) {
	Tiger tg=new Tiger();
}
}
