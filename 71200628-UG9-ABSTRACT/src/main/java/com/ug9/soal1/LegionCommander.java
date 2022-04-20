package com.ug9.soal1;

public class LegionCommander extends PhysicalCharacter implements TargetSkill{
    private int kill;

    public LegionCommander() {
        super("Legion Commander", 120,1200 , 30);
    }

    public void attack(Character karakter) {
        super.damage += (kill*10);
        karakter.health -= super.damage;
    }

    public boolean skill(Character karakter) {
        while(true){
            attack(karakter);
            attacked(karakter.damage);
            if(super.health<=0){
                return super.isDie();
            }else if(karakter.health<=0){
                return super.isDie();
            }
        }
    }
}
