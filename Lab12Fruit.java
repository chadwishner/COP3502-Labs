
public class Lab12Fruit {

	private String name;
	private String color;
	private int weight;
	private boolean cut;
	
	Lab12Fruit (String name, String color, int weight, boolean cut){
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.cut = cut;
	}
	
	Lab12Fruit (String name, String color){
		this.name = name;
		this.color = color;
		int weight = 1;
		boolean cut = false;
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public boolean isCut(){
		return this.cut;
	}
	
	public void setCut(boolean cut){
		this.cut = true;
	}
}
