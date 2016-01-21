import java.util.Random;

public class NocturnalCow extends Cow{
	private int x;
	private int y;
	private String name;
	private int hungriness;
	private int age;
	private int sicknessLevel;
	
	public NocturnalCow(String name, int hungriness, int age, int sicknessLevel){
		this.name = name;
		this.hungriness = hungriness;
		this.age = age;
		this.sicknessLevel = sicknessLevel;
	}
	
	public void doStuffForAnHour(int hour){
		if(hour%24 == 7||hour%24 ==  8||hour%24 ==  9||hour%24 ==  10||hour%24 ==  11||hour%24 ==  12||hour%24 ==  13||hour%24 ==  14||hour%24 ==  6||hour%24 ==  15||hour%24 ==  16){
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
		if(rand1.nextInt((int)(1/(0.0001*this.age*this.sicknessLevel)))==0){
			this.remove();
		}
	}
}
