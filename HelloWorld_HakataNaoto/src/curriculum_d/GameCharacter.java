package curriculum_d;

import java.util.Random;

public class GameCharacter {
 private String name;
 private int hp;
 private int at;
 private int sp;

 private static final Random RANDOM = new Random();

 public GameCharacter(String name) {
     this.name = name;
     this.hp = RANDOM.nextInt(51) + 50;  
     this.at = RANDOM.nextInt(11) + 5;  
     this.sp = RANDOM.nextInt(11) + 1;   
 }

 public GameCharacter(String name, int hp, int at, int sp) {
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

 public int attack(GameCharacter target) {
     int damage = this.at;
     target.hp -= damage;

     if (target.hp < 0) {
         target.hp = 0;
     }

     return damage;
 }
}
