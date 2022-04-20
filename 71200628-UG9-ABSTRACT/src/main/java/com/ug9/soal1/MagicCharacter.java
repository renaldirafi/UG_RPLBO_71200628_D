package com.ug9.soal1;

public abstract class MagicCharacter extends Character{
    protected int mana;

    public MagicCharacter(String name, int damage, int health, int mana) {
        super(name, damage, health);
        this.mana = mana;
    }
    public void showCharacterInfo(){
        super.showCharacterInfo();
        System.out.println("Mana = "+this.mana);
    }

    public void attacked(int damage){
        super.health -= damage;
    }
}