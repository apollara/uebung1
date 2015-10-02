package animationGame;

public class Vertex {
	
	public double x;
	public double y;
	
	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	

	public String toString () {
		return "(" + x +" , " + y + ")";
	}
	
	public double length() {
		return Math.sqrt(x*x+y*y);
	}
	
	public double distance(Vertex v2 ){
		double xx = v2.x - this.x;
		double yy = v2.y - this.y;
		
		return Math.sqrt(xx*xx + yy*yy);
	}
	
	public void skalarMultMod(double s){
		x = x*s;
		y = y*s;
	}
	
	public void addMod(double s){
		x = x+s;
		y = y+s;
	}
	
	public Vertex skalarMult(double s){
		return new Vertex(x*s,y*s);
	}
	
	public Vertex add(double s){
		return new Vertex(x+s,y+s);
	}
	
	public void addMod(double x, double y) {
		x = this.x +x;
	}
	
	public Vertex sub(double s){
		return new Vertex(x-s,y-s);
	}
	
	public double getX() {return x;}
	public double getY() {return y;}
	
	public void setX(double x){this.x =x;}
	public void setY(double y){this.y =y;}
	public void normalize(){
	double factor = this.length();
	x = x/factor;
	y = y/factor;
	}
	
	public boolean equals(Object thatObject){
		if (thatObject instanceof Vertex){
			Vertex that = (Vertex) thatObject;
			return this.x == that.x && this.y ==that.y;
		}
		return false;
	}


}
