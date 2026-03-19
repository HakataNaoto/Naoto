package curriculum_d;

import java.util.Random;

public class Character {
	private String name;
	private int hp; 
	private int at;
	private int sp;

	private static Random rand = new Random();

	public Character(String name) {
		this.name = name;
		this.hp = rand.nextInt(51) + 50;
		this.at = rand.nextInt(11) + 5;
		this.sp = rand.nextInt(11) + 1;
	}

	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAt() {
		return at;
	}

	public int getSp() {
		return sp;
	}

	public boolean isAlive() {
		return hp > 0;
	}

	public void attack(Character target) {
		target.hp -= this.at;
		if (target.hp < 0) {
			target.hp = 0;
		}
		System.out.println(this.name + " の攻撃！ " + this.at + " のダメージ！");
		System.out.println(target.name + " の残りHP: " + target.hp);
	}

}
