/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUItelepon;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author MasAS
 */
public class BandarTelepon extends javax.swing.JFrame {

    /**
     * Creates new form BandarTelepon
     */
    public BandarTelepon() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_hp = new javax.swing.JTextField();
        txt_telepon = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        bt_tambah = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setEditingColumn(0);
        jTable1.setEditingRow(0);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Nama");

        jLabel2.setText("Alamat");

        jLabel3.setText("Telepon");

        jLabel4.setText("Handphone");

        bt_tambah.setText("Tambah");
        bt_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tambahActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_hp, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                .addComponent(txt_telepon)
                                .addComponent(txt_alamat)
                                .addComponent(txt_nama)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bt_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_tambah)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        setSize(new java.awt.Dimension(423, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tambahActionPerformed
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("insert into tabel_data "
                    + "(nama,alamat, telepon, hp) "
                    + "values (?,?,?,?)");
            ps.setString(1, txt_nama.getText());
            ps.setString(2, txt_alamat.getText());
            ps.setInt(3, Integer.parseInt(txt_telepon.getText()));
            ps.setInt(4, Integer.parseInt(txt_hp.getText()));
            
            int i = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, i + " Data berhasil ditambahkan!!");
            TampilkanData();
            bersihkan();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Isi nomor telepon dengan Angka");
        }
    }//GEN-LAST:event_bt_tambahActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        TampilkanData();
    }//GEN-LAST:event_formComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Connection con = getConnection();
            int kolomTabel = 0;
            int barisTabel = jTable1.getSelectedRow();
            String value = jTable1.getModel().getValueAt(barisTabel, kolomTabel).toString();
            System.out.println(value);
            PreparedStatement ps = con.prepareStatement("delete from tabel_data where nama = ?");
            ps.setString(1, value);
            if(JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus kontak "+value+" ?","Perhatikan",JOptionPane.YES_NO_OPTION) 
                    == JOptionPane.YES_NO_OPTION){
                ps.executeUpdate();
                bersihkan();TampilkanData();
                ps.close();
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowTabel = jTable1.getSelectedRow();
        txt_nama.setText(jTable1.getModel().getValueAt(rowTabel, 0).toString());
        txt_alamat.setText(jTable1.getModel().getValueAt(rowTabel, 1).toString());
        txt_telepon.setText(jTable1.getModel().getValueAt(rowTabel, 2).toString());
        txt_hp.setText(jTable1.getModel().getValueAt(rowTabel, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE tabel_data "
                    + "SET nama = (?), alamat = (?),telepon = (?),hp = (?) "
                    + "Where nama = (?)");
            ps.setString(1, txt_nama.getText());
            ps.setString(2, txt_alamat.getText());
            ps.setInt(3, Integer.parseInt(txt_telepon.getText()));
            ps.setInt(4, Integer.parseInt(txt_hp.getText()));
            ps.setString(5, jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());
            if(JOptionPane.showConfirmDialog(null, "Apa anda yakin untuk mengubah data "+
                    jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString()+ " ?","Konfirmasi",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                ps.executeUpdate();
                bersihkan(); TampilkanData();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Isi nomor telepon dan hp dengan Angka");
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void bersihkan(){
        txt_nama.setText("");
        txt_alamat.setText("");
        txt_telepon.setText("");
        txt_hp.setText("");
    }
    
    private void TampilkanData(){
        try {
            Connection con = getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select nama,alamat,telepon,hp from tabel_data");
            while(model.getRowCount() > 0){
                for(int i = 0; i < model.getRowCount(); i++){
                    model.removeRow(i);
                }
            }
            while(rs.next()) {
                String nama = rs.getString("nama");
                String alamat = rs.getString("alamat");
                String telepon = rs.getString("telepon");
                String hp = rs.getString("hp");
                
                String[] data = {nama,alamat,telepon,hp};
                
                model.addRow(data);
            }
            jTable1.setModel(model);
            st.close();
            rs.close();
        } catch (Exception e) {
        }
    }
    
    private static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/db_telepon";
            String user="root";
            String pw="";
            
            con = DriverManager.getConnection(url, user, pw);
        }catch( ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Tidak Terhubung Gan !!");
        }
        return con;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BandarTelepon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BandarTelepon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BandarTelepon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BandarTelepon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BandarTelepon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_tambah;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_hp;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_telepon;
    // End of variables declaration//GEN-END:variables
    int baris = 0;
    static Object kolom[] = {"Nama","Alamat","Telepon","Handphone"};
    DefaultTableModel model = new DefaultTableModel(kolom,baris);
}
