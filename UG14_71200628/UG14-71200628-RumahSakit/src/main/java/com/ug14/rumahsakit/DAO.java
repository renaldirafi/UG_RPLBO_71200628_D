package com.ug14.rumahsakit;

import java.sql.*;

public class DAO  {
    private String url ="jdbc:mysql://localhost:3306/dao";
    public Connection connect() {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

    public int getDokterByID(Dokter dokter){
        String sql = "SELECT nama FROM dokter WHERE idDokter ="+dokter.getIdDokter();
        try(Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement()){
             ResultSet rs = stmt.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public int getSusterByID(Suster suster){
        String sql = "SELECT nama FROM suster WHERE idSuster ="+suster.getIdSuster();
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public int getPelayananByID(Pelayanan pelayanan){
        String sql = "SELECT nama FROM pelayanan WHERE idPelayanan ="+pelayanan.getIdPelayanan();
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public void inputPasien(Pasien pasien){

    }
    public Pasien inputPasien(){
        String sql = "INSERT INTO pasien VALUES (rm,nama,usia,alamat) ";
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return inputPasien();
    }

}
