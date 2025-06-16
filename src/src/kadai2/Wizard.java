package src.kadai2;

import java.lang.Character;

//package kadai1;
public class Wizard extends Character {
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃！" + "\n"+ "魔法使いは火の玉を放った！");
        System.out.println("敵に7のダメージを与えた！");
    }
}
