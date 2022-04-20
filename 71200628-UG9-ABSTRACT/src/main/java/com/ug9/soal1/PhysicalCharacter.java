package com.ug9.soal1;

public abstract class PhysicalCharacter extends Character {
    protected int armor;

    public PhysicalCharacter(String name, int damage, int health, int armor) {
        super(name, damage, health);
        this.armor = armor;
    }

    public void showCharacterInfo(){
        super.showCharacterInfo();
        System.out.println("armor = "+this.armor);
    }
    public void attacked(int damage){
        super.health -= damage - this.armor;
    }
}
