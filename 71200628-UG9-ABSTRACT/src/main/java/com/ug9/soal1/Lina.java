package com.ug9.soal1;

public class Lina extends MagicCharacter implements TargetSkill{

    public Lina() {
        super("Lina",70,800,120);

    }
    public void attack(Character karakter) {
        karakter.health -= super.damage;
        if(karakter.isDie()){
            super.mana += 45;
        }
    }

    public boolean skill(Character karakter) {

        karakter.health -= 600;
        super.mana -= 60;
        return false;
    }
}
