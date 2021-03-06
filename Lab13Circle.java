public class Lab13Circle extends Lab13Shape{
	private int radius;
	
	public Lab13Circle (String color, int radius){
		this.radius = radius;
		super.setColor(color);;
	}
	
	public int getRadius(){
		return this.radius;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public String toString(){
		String circle = "SHAPE INFO\nShape: Circle\n" + super.toString() + "\nRadius: " + radius + "\nArea: " + calculateArea() + "\n";		
		return circle;
	}
	
	public double calculateArea(){
		return Math.PI * radius * radius;
	}
}
