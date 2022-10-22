/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import view.ViewKasir;

/**
 *
 * @author basith
 */
public interface controllerKasir {
    public void Beli(ViewKasir kasir) throws SQLException;
    public void Batal(ViewKasir kasir) throws SQLException;
    
    
}
