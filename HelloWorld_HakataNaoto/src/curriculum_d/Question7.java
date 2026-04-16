package curriculum_d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
    private static final String DAEMON_FILE = "daemon_status.txt";
    private static final String LOG_FILE = "battle_log.txt";
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameCharacter daemon;
        try {
            daemon = loadDaemon(DAEMON_FILE);
        } catch (IOException e) {
            System.out.println("Daemon ステータスの読み込みに失敗しました。");
            e.printStackTrace();
            sc.close();
            return;
        }

        int battleCount = 0;

        while (true) {
            System.out.println("\n===== メニュー =====");
            System.out.println("1: バトル開始");
            System.out.println("2: バトルログを表示（" + LOG_FILE + " 読み込み）");
            System.out.println("0: 終了");
            System.out.print("番号を選択してください: ");

            String choice = sc.nextLine();

            if (choice.equals("1")) {
                battleCount++;
                System.out.println("\n=== バトル " + battleCount + " 開始 ===");

                System.out.print("Player の名前を入力してください: ");
                String playerName = sc.nextLine();

                GameCharacter player = new GameCharacter(playerName);
                GameCharacter daemonForThisBattle = copyDaemon(daemon);

                battle(player, daemonForThisBattle, battleCount);

            } else if (choice.equals("2")) {
                showBattleLog();

            } else if (choice.equals("0")) {
                System.out.println("ゲームを終了します。");
                break;
            }
        }

        sc.close();
    }

    private static GameCharacter copyDaemon(GameCharacter daemon) {
        return new GameCharacter(
                daemon.getName(),
                daemon.getHp(),
                daemon.getAt(),
                daemon.getSp()
        );
    }

    private static void battle(GameCharacter player, GameCharacter daemon, int battleNum) {
        System.out.println("=== ステータス ===");
        System.out.println(player.getName() + "  HP:" + player.getHp()
                + " AT:" + player.getAt()
                + " SP:" + player.getSp());
        System.out.println(daemon.getName() + "  HP:" + daemon.getHp()
                + " AT:" + daemon.getAt()
                + " SP:" + daemon.getSp());
        System.out.println("=================");

        GameCharacter first;
        GameCharacter second;

   
        if (player.getSp() > daemon.getSp()) {
            first = player;
            second = daemon;
        } else if (player.getSp() < daemon.getSp()) {
            first = daemon;
            second = player;
        } else {
            if (RANDOM.nextBoolean()) {
                first = player;
                second = daemon;
            } else {
                first = daemon;
                second = player;
            }
        }

        System.out.println("先攻: " + first.getName());
        System.out.println("後攻: " + second.getName());

        StringBuilder log = new StringBuilder();
        log.append("=== バトル ").append(battleNum).append(" ===\n");
        log.append("Player: ").append(player.getName())
           .append(" (HP:").append(player.getHp())
           .append(" AT:").append(player.getAt())
           .append(" SP:").append(player.getSp()).append(")\n");
        log.append("Daemon: ").append(daemon.getName())
           .append(" (HP:").append(daemon.getHp())
           .append(" AT:").append(daemon.getAt())
           .append(" SP:").append(daemon.getSp()).append(")\n");
        log.append("先攻: ").append(first.getName())
           .append(" / 後攻: ").append(second.getName()).append("\n\n");

        int turn = 1;

        while (player.isAlive() && daemon.isAlive()) {
            System.out.println("\n--- ターン " + turn + " ---");
            log.append("--- ターン ").append(turn).append(" ---\n");

            int damage1 = first.attack(second);
            System.out.println(first.getName() + " の攻撃！ " + damage1 + " のダメージ！");
            System.out.println(second.getName() + " の残りHP: " + second.getHp());
            log.append(first.getName()).append(" の攻撃！ ")
               .append(damage1).append(" のダメージ！ ")
               .append(second.getName()).append(" の残りHP: ")
               .append(second.getHp()).append("\n");

            if (!second.isAlive()) {
                break;
            }

            int damage2 = second.attack(first);
            System.out.println(second.getName() + " の攻撃！ " + damage2 + " のダメージ！");
            System.out.println(first.getName() + " の残りHP: " + first.getHp());
            log.append(second.getName()).append(" の攻撃！ ")
               .append(damage2).append(" のダメージ！ ")
               .append(first.getName()).append(" の残りHP: ")
               .append(first.getHp()).append("\n");

            if (!first.isAlive()) {
                break;
            }

            turn++;
        }

        String result;
        if (player.isAlive() && !daemon.isAlive()) {
            result = "勝者: " + player.getName();
        } else if (!player.isAlive() && daemon.isAlive()) {
            result = "勝者: " + daemon.getName();
        } else {
            result = "引き分け";
        }

        System.out.println("\n=== バトル終了 ===");
        System.out.println(result);

        log.append("\n=== バトル終了 ===\n");
        log.append(result).append("\n\n");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            bw.write(log.toString());
        } catch (IOException e) {
        }
    }

    public static GameCharacter loadDaemon(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();

            if (line == null) {
                throw new IOException("Daemon ステータスファイルが空です。");
            }

            line = line.trim();
            String[] parts = line.split("\\s+");

            if (parts.length < 4) {
                throw new IOException("Daemon ステータスファイルの形式が不正です。");
            }

            String name = parts[0];
            int hp = Integer.parseInt(parts[1]);
            int at = Integer.parseInt(parts[2]);
            int sp = Integer.parseInt(parts[3]);

            return new GameCharacter(name, hp, at, sp);
        }
    }

    private static void showBattleLog() {
        System.out.println("\n=== battle_log.txt の内容 ===");

        try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
        }

        
    }
}
