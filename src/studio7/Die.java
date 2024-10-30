package studio7;

public class Die {
	private int sides;
	
	public Die (int numSides) {
		this.sides = numSides;
	}
	
	public int diceRoll () {
		int rolled = 0;
		rolled = (int) (Math.random() * sides + 1);
		return rolled;
	}
	
	
	public static void main(String[] args) {
		Die dieX = new Die (12);
		System.out.println(dieX.diceRoll());
		
	}

}
