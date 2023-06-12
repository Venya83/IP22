package laalb3;

public class Chamber2 {
	public static void main(String[] args) {
		specif elephant = new specif();
		elephant.mass = 5000;
		elephant.velosity = 15;
		elephant.underwater = false;
		elephant.land = true;
		elephant.fly = false;
		
		specif eagle = new specif();
		eagle.mass = 5;
		eagle.underwater = false;
		eagle.land = true;
		eagle.fly = true;
		eagle.flyheith = 1000;
	}
}
class specif
{
	int mass;
	int velosity;
	boolean underwater;
	boolean land;
	boolean fly;
	int flyheith;
}