package com.ug9.soal1;


public class App {
    public static void main( String[] args ) {
        DragonKnight DK1 = new DragonKnight();
        LegionCommander LC1 = new LegionCommander();
        Lina L1 = new Lina();

        L1.skill(DK1);
        DK1.skill();
        DK1.attack(L1);
        LC1.attack(L1);
        L1.skill(LC1);
        DK1.showCharacterInfo();
        LC1.showCharacterInfo();
        L1.showCharacterInfo();
    }
}
