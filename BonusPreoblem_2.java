import stanford.karel.SuperKarel;

public class BonusPreoblem_2 extends SuperKarel {
	public void run() {
		if(beepersInBag()) {
			putBeeper();
		} 
		if(frontIsClear()) {
			move();
		}
	}
}
