import java.util.Random;

public class FlyingCow extends Cow{
	private int x;
	private int y;
	private String name;
	private int hungriness;
	private int age;
	private int sicknessLevel;
		
	public FlyingCow(String name, int hungriness, int age, int sicknessLevel){
		this.name = name;
		this.hungriness = hungriness;
		this.age = age;
		this.sicknessLevel = sicknessLevel;
	}
	
	public void doStuffForAnHour(int hour){
		if(hour%24 == 1||hour%24 ==  2||hour%24 ==  3||hour%24 ==  4||hour%24 ==  5||hour%24 ==  6||hour%24 ==  19||hour%24 ==  20||hour%24 ==  21||hour%24 ==  22||hour%24 ==  23||hour%24 ==  0){
			this.doNothing();
		}
		else{
			Random rand = new Random();
			this.x = rand.nextInt(11);
			this.y = rand.nextInt(11);
		}
		this.hungriness = this.hungriness + 2;
		this.age = this.age + 1;
		if(this.hungriness>100 || this.age > 90001){
			this.remove();
		}
		Random rand1 = new Random(); 
		if(rand1.nextInt((int)(1/(0.0001*this.age*this.sicknessLevel)))==0){
			this.remove();
		}
	}
}
