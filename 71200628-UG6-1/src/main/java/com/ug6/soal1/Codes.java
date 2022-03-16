package com.ug6.soal1;

public class Codes {
    private static String GOODSCODES = "GD";
    private static String VENDINGMACHINESCODE = "VM";
    private String[] TYPE = {"DR","FD","DG"};

    public String generateGoodsCode(String tipe, String nama){
        char fchar = nama.charAt(0);
        char lchar = nama.charAt(nama.length()-1);
        return (tipe+GOODSCODES+fchar+lchar);
    }
    public String generateVendingMachinesCode(int order){
        return (VENDINGMACHINESCODE+order);
    }
}
