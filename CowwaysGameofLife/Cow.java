import java.util.*;
public class Cow extends FarmObject{
	private int x;
	private int y;
	private String name;
	private int hungriness;
	private int age;
	private int sicknessLevel;
	
	public Cow(String name, int hungriness, int age, int sicknessLevel){
		this.name = name;
		this.hungriness = hungriness;
		this.age = age;
		this.sicknessLevel = sicknessLevel;
	}
	
	public void doNothing(){
	}

	@Override
	public void doStuffForAnHour(int hour){
		if(hour%24 == 1||hour%24 ==  2||hour%24 ==  3||hour%24 ==  4||hour%24 ==  5||hour%24 ==  6||hour%24 ==  19||hour%24 ==  20||hour%24 ==  21||hour%24 ==  22||hour%24 ==  23||hour%24 ==  0){
			this.doNothing();
		}
		else{
			Random rand = new Random();
			if(rand.nextInt(4)== 0){
				this.x = this.x+1;
				if(this.x>10){
					this.x = this.x-1;
					this.doNothing();
				}
			}
			if(rand.nextInt(4)== 1){
				this.x = this.x-1;
				if(this.x<0){
					this.x = this.x+1;
					this.doNothing();
				}
			}
			if(rand.nextInt(4)== 2){
				this.y = this.y+1;
				if(this.y>10){
					this.y = this.y-1;
					this.doNothing();
				}
			}
			if(rand.nextInt(4)== 3){
				this.y = this.y-1;
				if(this.y<0){
					this.y = this.y+1;
					this.doNothing();
				}
			}
		}
		this.hungriness = this.hungriness + 2;
		this.age = this.age + 1;
		if(this.hungriness>100 || this.age > 90001){
			this.remove();
		}
		Random rand1 = new Random(); 
		if(rand1.nextInt((int)(1/(0.000001*this.age*this.sicknessLevel)))==0){
			this.remove();
		}
	}
}
	