/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookaplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author MasAS
 */
public class BookAplication {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Aplikasi Perpustakaan");
        System.out.println("1. Tampilkan Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Delete Data");
        System.out.println("Pilihan Anda : ");
        switch (sc.nextInt()) {
           case 1 :
           {
                showSomeData();
                break;
           }
           case 2 :
           {
               insertSomeData();
               break;
           }
           case 3 :
           {
               deleteSomeData();
               break;
           }
           default :
           {
               System.out.println("Pilihan Salah\nSystem Exit");
           }
        }
    }
    
    private static void showSomeData() {
        try {
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from books");
        System.out.println ("Daftar Buku : ");
        System.out.println ("====================");

        while (rs.next()) {
            int id = rs.getInt("idBooks");
            String nama = rs.getString("Nama");
            String pengarang = rs.getString("Pengarang");
            String penerbit = rs.getString("Penerbit");
            int thnterbit = rs.getInt("TahunTerbit");
            System.out.println(id + "\t" + nama + "\t" + pengarang + "\t" + penerbit
            + "\t" + thnterbit);
        }
            st.close();
            rs.close();
        }
        catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    private static void insertSomeData() {
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("insert into books " +
            "(Nama, Pengarang, Penerbit, TahunTerbit) " +
            "values (?,?,?,?)");
            System.out.println ("Nama Buku : ");
            String nama = sc.next();

            System.out.println ("Pengarang Buku : ");
            String pengarang = sc.next();

            System.out.println ("Penerbit Buku : ");
            String penerbit = sc.next();
            System.out.println ("Tahun terbit Buku : ");
            int tahunterbit = sc.nextInt();

            ps.setString(1, nama);
            ps.setString(2, pengarang);
            ps.setString(3, penerbit);
            ps.setInt(4, tahunterbit);

            int i = ps.executeUpdate();
            System.out.println(i + "rows added");

            System.out.println("Tampilkan data ? (y/n)");
            if ("y".equalsIgnoreCase(sc.next())) {
                showSomeData();
            }
        }

        catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    private static void deleteSomeData() {
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("delete from books " +
            "where idBooks = ?");
            System.out.println("ID buku = ");
            int id = sc.nextInt();
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            System.out.println(i + "rows deleted");

            System.out.println("Tampilkan data ? (y/n)");
            if ("y".equalsIgnoreCase(sc.next())) {
                showSomeData();
            }
            ps.close();
        }
        catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    private static Connection getConnection(){
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/booklibrary";
            String user = "root";
            String pw = "";

            con = DriverManager.getConnection(url, user, pw);
        }
        catch ( ClassNotFoundException e){
            System.out.println (e.getMessage());
        }
        catch (SQLException e){
            System.out.println (e.getMessage());
        }
            return con;
    }
}

