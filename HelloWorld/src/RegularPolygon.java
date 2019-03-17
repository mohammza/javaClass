
public class RegularPolygon {
	private int n; //number of sides in a polygon
	private double side; //stores lenght of the side
	private double x;
	private double y;
	
	RegularPolygon(){
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		x = y = 0; //centered at (0,0)
	}
	RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	//Accessor and Mutator methods
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	//calculate perimeter
	public double getPerimeter() {
		return n * side;
	}
	//calculate area
	public double getArea() {
		double top = n * Math.pow(side, 2);
		double bottom = 4 * Math.tan(3.142/n);
		return top / bottom;
	}
	
	
	
	//main method
	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6,4);
		RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println("Perimeter p1 = " + p1.getPerimeter() );
		System.out.println("Area p1 = " + p1.getArea() );
		
		System.out.println("Perimeter p2 = " + p2.getPerimeter() );
		System.out.println("Area p2 = " + p2.getArea() );
		
		System.out.println("Perimeter p3 = " + p3.getPerimeter() );
		System.out.println("Area p3 = " + p3.getArea() );
	}
}


