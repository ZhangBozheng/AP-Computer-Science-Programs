import java.util.Random;
public class Grass extends FarmObject {
	private int AmountofGrass;
	private int x;
	private int y;
	
	public Grass(int AmountofGrass){
		AmountofGrass = this.AmountofGrass;
	}
	
	public void doStuffForAnHour(int hour){
		this.AmountofGrass++;
		Random rand = new Rand();
		if(rand.nextInt((int)1/(0.1*this.AmountofGrass)) == 0){
			this.AmountofGrass = 1;
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
			if(rand1.nextInt(4)== 3){
				this.y = this.y-1;
				if(this.y<0){
					this.y = this.y+1;
				}
			}
		}
		
	}
}
