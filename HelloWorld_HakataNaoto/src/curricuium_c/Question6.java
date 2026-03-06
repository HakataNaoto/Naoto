package curricuium_c;

public class Question6 {
	public static void main(String[] args) {
		InputHandler input = new InputHandler();
		HandGenerator generator = new HandGenerator();
		Player player = new Player();
		CPU cpu = new CPU(generator);

		while (true) {
			int playerChoice = input.readChoice();
			player.chooseHand(playerChoice);
			cpu.chooseHand();

			System.out.println("あなたの手：" + player.getHand());
			System.out.println("CPUの手：" + cpu.getHand());

			String result = judge(player.getHand(), cpu.getHand());
			System.out.println(result);

			if (result.equals("あなたの勝ち！")) {
				input.close();
				break;
			}
		}
	}

	private static String judge(String playerHand, String cpuHand) {
		if (playerHand.equals(cpuHand)) {
			return "あいこ";
		}
		if ((playerHand.equals("グー") && cpuHand.equals("チョキ")) ||
				(playerHand.equals("チョキ") && cpuHand.equals("パー")) ||
				(playerHand.equals("パー") && cpuHand.equals("グー"))) {
			return "あなたの勝ち！";
		}
		return "あなたの負け。";
	}

}
