import java.util.Random;

public class PoisonedGrass extends Grass {
	private int AmountofGrass;
	private int x;
	private int y;
	
	public PoisonedGrass(int AmountofGrass){
		AmountofGrass = this.AmountofGrass;
	}
	
	public void doStuffForAnHour(int hour){
		this.AmountofGrass = this.AmountofGrass +2;
		Random rand1 = new Random();
		if(rand1.nextInt(4)== 0){
			this.x = this.x+1;
			if(this.x>10){
				this.x = this.x-1;
			}
		}
		if(rand1.nextInt(4)== 1){
			this.x = this.x-1;
			if(this.x<0){
				this.x = this.x+1;
			}
		}
		if(rand1.nextInt(4)== 2){
			this.y = this.y+1;
			if(this.y>10){
				this.y = this.y-1;
			}
		}
	}
}
