package animationGame;

public class TestVertex {
	
	public static void main(String[] args) {
		/*Vertex v1 = new Vertex (42,4);
		Vertex v2 = new Vertex (555,98);
		
		
		
		v2.setX(99);
		v2.setY(99);
		System.out.println(v2);
		System.out.println(v2.length());
		System.out.println(v1.distance(v2));
		v2.normalize();
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v2.length());*/
		
		GeometricObject o1 = new GeometricObject(8);
		System.out.println(o1);
		System.out.println(o1.circumference());
		System.out.println(o1.area());

	}
}
