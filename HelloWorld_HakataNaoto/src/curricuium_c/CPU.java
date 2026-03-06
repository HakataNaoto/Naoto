package curricuium_c;

public class CPU {
	private HandGenerator generator;
	private String hand;

	public CPU(HandGenerator generator) {
		this.generator = generator;
	}

	public void chooseHand() {
		this.hand = generator.generate();
	}

	public String getHand() {
		return hand;
	}
}
