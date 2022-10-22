/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.controllerInput;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.KoneksiDB;
import view.InputMinuman;

/**
 *
 * @author basith
 */
public class modelInput implements controllerInput{
    
    
    @Override
    public void Simpan(InputMinuman IM) throws SQLException {
          try {
           Connection con = KoneksiDB.getcon();
           String sql = "Insert Into input VALUES(?,?,?,?)";
           PreparedStatement prepare = con.prepareStatement(sql);
           prepare.setString(1, IM.txtKode.getText());
           prepare.setString(2, IM.txtNama.getText());
           prepare.setString(3, IM.txtStcock.getText());
           prepare.setString(4, IM.txtHarga.getText());
           prepare.executeUpdate();
           JOptionPane.showMessageDialog(null, "Data Berhasil diSimpan");
           prepare.close();
           Baru(IM);
       } catch (Exception e) {
           System.out.println(e);
       } finally {
           Tampil(IM);
       }
     }

    @Override
    public void Hapus(InputMinuman IM) throws SQLException {
   
    }

    @Override
    public void Batal(InputMinuman IM) throws SQLException {
   
    }

    @Override
    public void Ubah(InputMinuman IM) throws SQLException {
    }

    @Override
    public void Baru(InputMinuman IM) throws SQLException {
   
    }

    @Override
    public void Tampil(InputMinuman IM) throws SQLException {
        
    }

    @Override
    public void kliktabel(InputMinuman IM) throws SQLException {
     

    
    }
    }

