package com.ug9.soal1;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill{
    private int dragonFormAttack;

    public DragonKnight() {
        super("DragonKnight",95,1800,50);
    }

    public void skill() {
        this.dragonFormAttack =2;
    }

    public void attack(Character karakter) {
        if(dragonFormAttack>0){
            super.damage += 90;
            this.dragonFormAttack-= 1;
            karakter.health -= super.damage;
            super.damage =95;
        }else{
            super.damage =95;
        }
    }
}
