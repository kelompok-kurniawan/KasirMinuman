/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import view.InputMinuman;

/**
 *
 * @author basith
 */
public interface controllerInput {
    public void Simpan(InputMinuman IM) throws SQLException;
    public void Hapus(InputMinuman IM) throws SQLException;
    public void Batal(InputMinuman IM) throws SQLException;
    public void Ubah(InputMinuman IM) throws SQLException;
    public void Baru(InputMinuman IM) throws SQLException;
    public void Tampil(InputMinuman IM) throws SQLException;
    public void kliktabel(InputMinuman IM) throws SQLException;
    
}
