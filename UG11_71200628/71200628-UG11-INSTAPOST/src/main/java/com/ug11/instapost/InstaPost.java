package com.ug11.instapost;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost(){

    }
    public void printInfo(){
        System.out.println("Username: "+username);
        System.out.println("Email: "+email);
        System.out.println("Total Mention: "+totalMention);
    }
    public void login (String email){
        StringBuilder sb = new StringBuilder();
        boolean coba1 =email.contains("@");
        boolean coba2 = email.contains("@gmail.com");
        if(coba1){
            if(coba2){
                System.out.println("Login berhasil");
                this.email = email;
                String[] isi = email.split("");
                for(int i=0; i<isi.length-10;i++){
                    sb.append(isi[i]);
                }
                String str = sb.toString();
                str = str.toUpperCase();
                this.username=str;
            }else{
                EmailException ee1 = new EmailException(2);
                ee1.getErrorMessage();
            }
        }else{
            EmailException ee2 = new EmailException(1);
            ee2.getErrorMessage();
        }
    }
    public void post(String caption){
        StringBuilder sb1 = new StringBuilder();
        int totalini = 0;
        for(String kata : caption.split(" ")){
            if(kata.contains("@")){
                sb1.append(kata+" ");
                totalini +=1;
                this.totalMention+=1;
            }

        }
        System.out.println(sb1);
        System.out.println("Caption: "+caption);
        System.out.println("Pengguna yang anda mention: "+sb1);
        System.out.println("Total username yang anda mention: "+totalini);
    }
}
