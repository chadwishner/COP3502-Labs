public class Lab13Rectangle extends Lab13Shape{
	private int width;
	private int height;
	
	public Lab13Rectangle(String color, int width, int height){
		this.width = width;
		this.height = height;
		super.setColor(color);;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public void setBase(int width){
		this.width = width;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public String toString(){
		String rectangle = "SHAPE INFO\nShape: Rectangle\n" + super.toString() + "\nWidth: " + width + "\nHeight: " + height + "\nArea: " + calculateArea() + "\n";		
		return rectangle;
	}
	
	public double calculateArea(){
		return .5*width*height;
	}
}
