/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.controllerKasir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import koneksi.KoneksiDB;
import view.ViewKasir;

/**
 *
 * @author basith
 */
public class modelKasir implements controllerKasir {

    String Minuman;
    public Map<String, Integer> listHarga = new HashMap<>();  //key bertipe String  dan nilai yg tersimpan adalah integer
    public Integer totalHarga = 0;
    public Integer uang = 0;
    public Integer kembali = 0;
    public Integer total = 0;

    @Override
    public void Beli(ViewKasir kasir) throws SQLException {


            
    }

    @Override
    public void Batal(ViewKasir kasir) throws SQLException {
           

    }

}
