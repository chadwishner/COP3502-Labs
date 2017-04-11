
public abstract class Lab13Shape {
	private String color;
	
	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String toString(){
		return "Color: " + color;
	}
	public abstract double calculateArea();
}
