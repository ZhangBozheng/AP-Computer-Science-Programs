public class Cow{
	private String name;
	private int weight;
	private int nutrition;
	
	public Cow(String inputName, int inputWeight, int inputNutrition){
		this.name = inputName;
		this.weight = inputWeight;
		this.nutrition = inputNutrition;
	}
	
	public void grow(){
		this.weight = this.weight+this.nutrition;
		this.nutrition = 0;
	}
	
	public void die(){
		this.weight = 0;
	}
	
	public void eat(Cow animal){
		this.nutrition = this.nutrition + (animal.weight/2);
		animal.die();
	}
	
	public String toString(){
		return "/Cow:{name: "+this.name+", weight: "+this.weight+", nutrition: "+this.nutrition+"}";
	}
}