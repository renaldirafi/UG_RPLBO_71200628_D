package com.ug10.soal1;

public class App 
{
    public static void main( String[] args ) throws EmailException,LoginException,PasswordException,UsernameException {
        String username = "";
        String email = "";
        String pass;
        String password = "";
        String konfPass = "";
        String konfPassword = "";
        System.out.println("Selamat datang di Toko Rapi");
        System.out.println("Silahkan daftarkan diri kamu untuk dapat mengakses menu di Toko Rapi");
        boolean ok = true;
        while(ok){
            username = System.console().readLine("Username: ");
            try{
                if (username.isEmpty()){
                    throw new UsernameException(1);
                }else if(username.length()<7){
                    throw new UsernameException(2);
                }else{
                    ok = false;
                }
            }catch (UsernameException e){
                System.out.println(e.getErrMessage());
            }
        }

        ok=true;
        while(ok){
            email = System.console().readLine("Email : ");
            try{
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+\\.+[a-z]+";
                String emailPattern2 = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if(email.matches(emailPattern)){
                    throw new EmailException();
                }else if(email.matches(emailPattern2)){
                    throw new EmailException();
                }else{
                    ok = false;
                }
            }catch(EmailException e){
                System.out.println(e.getErrMessage());
            }
        }

            pass = System.console().readLine("Password : ");
            password = new String(pass);
                if(password.isEmpty()){
                    throw new PasswordException(1);
                }else if(password.length()<7){
                    throw new PasswordException(2);
                }else if(password.equals(username)){
                    throw new PasswordException(3);
                }else{
                    String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
                    boolean flagKecil = false;
                    boolean flagBesar = true;
                    boolean flagAngka = true;
                    for(int i=0;i<password.length();i++){
                        char c = password.charAt(i);
                        if(Character.isLowerCase(c)){
                            flagKecil = true;
                        }
                        if(Character.isUpperCase(c)){
                            flagBesar= true;
                        }
                        if(Character.isDigit(c)){
                            flagAngka=true;
                        }
                        if (!(flagKecil && flagAngka && flagBesar)){
                            System.out.println(flagAngka);
                            System.out.println(flagBesar);
                            System.out.println(flagKecil);
                            throw new PasswordException(4);
                        }

                    }

        }
        ok = true;
        while(ok){
            konfPass = System.console().readLine("Konfirm Password : ");
            konfPassword = new String(konfPass);
            try{
                if (konfPass == pass){
                    throw new PasswordException(5);
                }else{
                    ok = false;
                }
            }catch (PasswordException e){
                System.out.println(e.getErrMessage());
            }
        }
        User u1 = new User(username,email,password);
        String uname = System.console().readLine("Usename: ");
        String passs = System.console().readLine("Password");
        try{
            if(uname == u1.getUsername() && uname == u1.getPassword()){
                throw new LoginException();
            }
        }catch(LoginException e){
            System.out.println(e.getErrMessage());
        }
        System.out.println("Selamat datang,"+u1.getUsername());
    }
}
