package curricuium_c;

public class Player {
	private String hand;

	public void chooseHand(int choice) {
		switch (choice) {
		case 0:
			hand = "グー";
			break;
		case 1:
			hand = "チョキ";
			break;
		case 2:
			hand = "パー";
			break;
		}
	}

	public String getHand() {
		return hand;
	}
}
