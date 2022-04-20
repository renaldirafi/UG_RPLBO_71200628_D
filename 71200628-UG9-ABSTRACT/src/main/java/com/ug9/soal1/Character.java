package com.ug9.soal1;

public abstract class Character implements ObjectAttack{
    protected int damage;
    protected String name;
    protected int health;

    public Character(String name, int damage, int health){
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public void showCharacterInfo(){
        System.out.println("name = "+this.name);
        System.out.println("health = "+this.health);
        System.out.println("Damage = "+this.damage);

    }
    public boolean isDie(){
        if (this.health<=0){
            return false;
        }else{
            return true;
        }
    }
    public abstract void attacked(int damage);
}
