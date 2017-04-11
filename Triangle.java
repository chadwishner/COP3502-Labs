public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(String color, int base, int height){
		this.base = base;
		this.height = height;
		super.setColor(color);;
	}
	
	public int getBase(){
		return this.base;
	}
	
	public void setBase(int base){
		this.base = base;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public String toString(){
		String triangle = "SHAPE INFO\nShape: Triangle\n" + super.toString() + "\nBase: " + base + "\nHeight: " + height + "\nArea: " + calculateArea() + "\n"; 
		return triangle;
	}
	
	public double calculateArea(){
		return .5*base*height;
	}
}
