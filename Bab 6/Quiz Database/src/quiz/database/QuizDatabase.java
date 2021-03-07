/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.database;

import java.sql.Connection;
import java.sql.Date;
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author Ali
 */
public class QuizDatabase {

    static Scanner input = new Scanner(System.in);

    static Connection con;
    static Statement stm;
    static ResultSet rs;
    static String sql = "";
    static PreparedStatement ps;
    static int levelUser = 0;

    static int score = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Username : ");
        String name = input.nextLine();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter hrs = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();

        String dateQ = dt.format(now);
        String timeQ = hrs.format(now);
        //dimana input name akan 
        userCheck(name);
        //dimasukkan kedalam fungsi yang akan mengecek levelUser
        if (levelUser == 1) {
            System.out.println("1. Kerjakan Soal");
            System.out.println("2. Lihat Progress Teman-Teman");
            System.out.println("3. Lihat Hasil Sendiri");
            System.out.print("Pilihan : ");
            switch (input.nextInt()) {
                case 1: {
                    startQuiz(name, dateQ, timeQ);
                    break;
                }
                case 2: {
                    seeAllHistory();
                    break;
                }
                case 3: {
                    seeMyHistory(name);
                    break;
                }
                default: {
                    System.out.println("Pilihan Salah");
                }
            }
        } else if (levelUser == 2) {
            System.out.println("1. Kerjakan Soal");
            System.out.println("2. Lihat Pengerjaan Soal");
            System.out.print("Pilihan : ");
            switch (input.nextInt()) {
                case 1: {
                    startQuiz(name, dateQ, timeQ);
                    break;
                }
                case 2: {
                    seeMyHistory(name);
                    break;
                }
                default: {
                    System.out.println("Pilihan Tidak Tersedia");
                }
            }
        }

    }

    public static int userCheck(String name) {
        try {
            con = (Connection) quiz.database.connection.getConnection();
            sql = "select level from hak_akses where nama=" + "'" + name + "'";
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                levelUser = rs.getInt("level");
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return levelUser;
    }

    public static void startQuiz(String username, String date, String time) {
        for (int i = 0; i < 10; i++) {
            randomnumber();
        }
        System.out.println("Congrats " + username + " Your Score Is = " + score);
        try {
            con = (Connection) quiz.database.connection.getConnection();
            sql = "insert into pengerjaan_soal (id_pengerjaan, pengguna, skor, tanggal_pengerjaan, jam_pengerjaan)values (null,?,?,?,?)";
            ps =con.prepareStatement(sql);
            
            ps.setString(1,username);
            ps.setInt(2, score);
            ps.setString(3,date);
            ps.setString(4, time);
            
            ps.execute();

            con.close();
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }

    public static void randomnumber() {
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        //System.out.println(a+" "+b);
        operator(a, b);
    }

    public static void operator(int a, int b) {
        Random rand = new Random();
        int op = rand.nextInt(4);
        //System.out.print(op + "");
        perhitungan(a, b, op);
    }

    public static void perhitungan(int a, int b, int op) {
        Scanner scan = new Scanner(System.in);

        int nomer = 0;
        int hasil;
        int hasilkey;
        switch (op) {
            case 0:
                hasil = a + b;
                System.out.print(a + " + " + b + " = ");
                hasilkey = scan.nextInt();
                if (hasilkey == hasil) {
                    score += 10;
                }
                nomer++;
                break;
            case 1:
                hasil = a - b;
                System.out.print(a + " - " + b + " = ");
                hasilkey = scan.nextInt();
                if (hasilkey == hasil) {
                    score += 10;
                }
                nomer++;
                break;
            case 2:
                hasil = a * b;
                System.out.print(a + " * " + b + " = ");
                hasilkey = scan.nextInt();
                if (hasilkey == hasil) {
                    score += 10;
                }
                nomer++;
                break;
            case 3:
                double hasil1 = a / b;
                System.out.print(a + " / " + b + " = ");
                double num = scan.nextDouble();
                if (num == hasil1) {
                    score += 10;
                }
                break;
        }
    }

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void seeAllHistory() {
        try {
            con = (Connection) quiz.database.connection.getConnection();
            sql = "select * from pengerjaan_soal";
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            int no = 0;
            while (rs.next()) {
                no++;
                String nama = rs.getString("pengguna");
                int skor = rs.getInt("skor");
                Date tanggal = rs.getDate("tanggal_pengerjaan");
                Time waktu = rs.getTime("jam_pengerjaan");
                System.out.println(no + " || " + nama + " || " + skor + " || "
                        + tanggal + " || " + waktu);
            }
            stm.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    public static void seeMyHistory(String username) {
        try {
            con = (Connection) quiz.database.connection.getConnection();
            sql = "select * from pengerjaan_soal where pengguna=" + "'" + username + "';";
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            int no = 0;
            System.out.println("Username : " + username);
            while (rs.next()) {
                no++;
                String nama = rs.getString("pengguna");
                int skor = rs.getInt("skor");
                Date tanggal = rs.getDate("tanggal_pengerjaan");
                Time waktu = rs.getTime("jam_pengerjaan");
                System.out.println(no + " || " + nama + " || " + skor + " || "
                        + tanggal + " || " + waktu);
            }
            System.out.println("Total Quiz : " + no);
            stm.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

}
